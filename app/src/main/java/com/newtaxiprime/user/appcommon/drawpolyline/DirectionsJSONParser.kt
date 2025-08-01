package com.newtaxiprime.user.appcommon.drawpolyline

/**
 * @package com.newtaxiprime.userdriver
 * @subpackage map.drawpolyline
 * @category DirectionsJSONParser
 * @author Seen Technologies
 *
 */

import android.location.Location
import com.google.android.gms.maps.model.LatLng
import com.newtaxiprime.user.taxiapp.datamodels.StepsClass
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.util.*

/* ************************************************************
                      DirectionsJSONParser
Its used to get DirectionsJSONParser
*************************************************************** */
public class DirectionsJSONParser {

    /**
     * Receives a JSONObject and returns a list of lists containing latitude and longitude
     */
    fun parse(jObject: JSONObject): List<List<HashMap<String, String>>> {

        val routes = ArrayList<List<HashMap<String, String>>>()
        lateinit var jRoutes: JSONArray
        lateinit var jLegs: JSONArray
        lateinit var jSteps: JSONArray

        try {

            jRoutes = jObject.getJSONArray("routes")

            /** Traversing all routes  */
            for (i in 0 until jRoutes.length()) {
                jLegs = (jRoutes.get(i) as JSONObject).getJSONArray("legs")
                val path = ArrayList<HashMap<String, String>>()

                /** Traversing all legs  */
                for (j in 0 until jLegs.length()) {
                    jSteps = (jLegs.get(j) as JSONObject).getJSONArray("steps")

                    /** Traversing all steps  */
                    for (k in 0 until jSteps.length()) {
                        var polyline: String
                        polyline = ((jSteps.get(k) as JSONObject).get("polyline") as JSONObject).get("points") as String
                        val list = decodePoly(polyline)

                        /** Traversing all points  */
                        for (l in list.indices) {
                            val hm = HashMap<String, String>()
                            hm["lat"] = java.lang.Double.toString((list[l] as LatLng).latitude)
                            hm["lng"] = java.lang.Double.toString((list[l] as LatLng).longitude)
                            path.add(hm)
                        }
                    }
                    routes.add(path)
                }
            }

        } catch (e: JSONException) {
            e.printStackTrace()
        } catch (e: Exception) {
        }

        return routes
    }


    /**
     * Receives a JSONObject and returns a Distance
     */
    fun parseDistance(jObject: JSONObject): String {

        var distances = ""


        try {

            val array = jObject.getJSONArray("routes")
            val routes = array.getJSONObject(0)
            val legs = routes.getJSONArray("legs")
            val steps = legs.getJSONObject(0)
            val distance = steps.getJSONObject("distance")
            distances = distance.getString("value")
        } catch (e: JSONException) {
            e.printStackTrace()
        } catch (e: Exception) {
        }

        return distances
    }

    fun parseTime(jObject: JSONObject): String {

        var distances = ""


        try {

            val array = jObject.getJSONArray("routes")
            val routes = array.getJSONObject(0)
            val legs = routes.getJSONArray("legs")
            val steps = legs.getJSONObject(0)
            val distance = steps.getJSONObject("duration")
            distances = distance.getString("value")
        } catch (e: JSONException) {
            e.printStackTrace()
        } catch (e: Exception) {
        }

        return distances
    }



    /**
     * To get step points for Eta calculation
     */
    fun parseStepPoints(jObject: JSONObject): ArrayList<StepsClass>{

        var stepPoints = ArrayList<StepsClass>()

        try {

            val array = jObject.getJSONArray("routes")
            val routes = array.getJSONObject(0)
            val legs = routes.getJSONArray("legs")
            val leg = legs.getJSONObject(0)
            val steps = leg.getJSONArray("steps")



            for (j in 0 until steps.length()) {
                var lat =  steps.getJSONObject(j).getJSONObject( "end_location").getString("lat")
                var lng =  steps.getJSONObject(j).getJSONObject( "end_location").getString("lng")
                var secs =  steps.getJSONObject(j).getJSONObject( "duration").getString("value")

                val targetLocation = Location("")
                targetLocation.setLatitude(lat.toDouble())
                targetLocation.setLongitude(lng.toDouble())

                stepPoints.add(StepsClass(targetLocation, secs))


            }


        } catch (e: JSONException) {
            e.printStackTrace()
        } catch (e: Exception) {
        }

        return stepPoints
    }



    /**
     * To get overall duration
     */
    fun parseDuration(jObject: JSONObject): Int{

        var duration = 0

        try {

            val array = jObject.getJSONArray("routes")
            val routes = array.getJSONObject(0)
            val legs = routes.getJSONArray("legs")
            val leg = legs.getJSONObject(0)
            val durationObject = leg.getJSONObject("duration")

            duration = durationObject.getInt("value")




        } catch (e: JSONException) {
            e.printStackTrace()
        } catch (e: Exception) {
        }

        return duration
    }



    /**
     * Receives a JSONObject and returns a OverviewPolyline for static map route
     */
    fun parseOverviewPolyline(jObject: JSONObject): String {

        var overviewPolylines = ""


        try {

            val array = jObject.getJSONArray("routes")
            val routes = array.getJSONObject(0)
            val overviewPolyline = routes.getJSONObject("overview_polyline")
            overviewPolylines = overviewPolyline.getString("points")
        } catch (e: JSONException) {
            e.printStackTrace()
        } catch (e: Exception) {
        }

        return overviewPolylines
    }

    /**
     * Method to decode polyline points
     * Courtesy : http://jeffreysambells.com/2010/05/27/decoding-polylines-from-google-maps-direction-api-with-java
     */
    private fun decodePoly(encoded: String): List<*> {

        val poly = ArrayList<LatLng>()
        var index = 0
        val len = encoded.length
        var lat = 0
        var lng = 0

        while (index < len) {
            var b: Int
            var shift = 0
            var result = 0
            do {
                b = encoded[index++].toInt() - 63
                result = result or (b and 0x1f shl shift)
                shift += 5
            } while (b >= 0x20)
            val dlat = if (result and 1 != 0) (result shr 1).inv() else result shr 1
            lat += dlat

            shift = 0
            result = 0
            do {
                b = encoded[index++].toInt() - 63
                result = result or (b and 0x1f shl shift)
                shift += 5
            } while (b >= 0x20)
            val dlng = if (result and 1 != 0) (result shr 1).inv() else result shr 1
            lng += dlng

            val p = LatLng(lat.toDouble() / 1E5,
                    lng.toDouble() / 1E5)
            poly.add(p)
        }

        return poly
    }
}