package com.newtaxiprime.user.taxiapp.views.search;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00b6\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \u00bf\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0004\u00bf\u0002\u00c0\u0002B\u0005\u00a2\u0006\u0002\u0010\u000bJ\n\u0010\u0080\u0002\u001a\u00030\u0081\u0002H\u0007J\n\u0010\u0082\u0002\u001a\u00030\u0081\u0002H\u0004J\u0014\u0010\u0083\u0002\u001a\u00030\u0081\u00022\b\u0010\u0084\u0002\u001a\u00030\u0085\u0002H\u0002J\b\u0010\u0086\u0002\u001a\u00030\u0081\u0002J\n\u0010\u0087\u0002\u001a\u00030\u0090\u0001H\u0002J\b\u0010\u0088\u0002\u001a\u00030\u0081\u0002J\n\u0010\u0089\u0002\u001a\u00030\u0081\u0002H\u0007J\t\u0010T\u001a\u00030\u0081\u0002H\u0007J\n\u0010\u008a\u0002\u001a\u00030\u0081\u0002H\u0007J\u0014\u0010\u008b\u0002\u001a\u00030\u0081\u00022\b\u0010\u008c\u0002\u001a\u00030\u00a1\u0001H\u0002J2\u0010\u008d\u0002\u001a\u00030\u008e\u00022\b\u0010\u008f\u0002\u001a\u00030\u008e\u00022\b\u0010\u0090\u0002\u001a\u00030\u008e\u00022\b\u0010\u0091\u0002\u001a\u00030\u008e\u00022\b\u0010\u0092\u0002\u001a\u00030\u008e\u0002H\u0002J\u001a\u0010\u0093\u0002\u001a\u00030\u0081\u00022\u0007\u0010\u0084\u0002\u001a\u00020i2\u0007\u0010\u0094\u0002\u001a\u00020\u0012J\u001a\u0010\u0095\u0002\u001a\u00030\u0081\u00022\u0007\u0010\u0096\u0002\u001a\u00020\u00122\u0007\u0010\u0094\u0002\u001a\u00020\u0012J\u0011\u0010\u0097\u0002\u001a\u00030\u0081\u00022\u0007\u0010\u0098\u0002\u001a\u00020\u0012J\b\u0010\u0099\u0002\u001a\u00030\u0081\u0002J\b\u0010\u009a\u0002\u001a\u00030\u0081\u0002J\n\u0010\u009b\u0002\u001a\u00030\u0081\u0002H\u0003J\n\u0010\u009c\u0002\u001a\u00030\u0081\u0002H\u0016J\n\u0010\u009d\u0002\u001a\u00030\u0081\u0002H\u0016J\n\u0010\u009e\u0002\u001a\u00030\u0081\u0002H\u0016J\n\u0010\u009f\u0002\u001a\u00030\u0081\u0002H\u0016J\u0013\u0010\u00a0\u0002\u001a\u00030\u0081\u00022\u0007\u0010\u00a1\u0002\u001a\u00020\u001bH\u0016J\u0016\u0010\u00a2\u0002\u001a\u00030\u0081\u00022\n\u0010\u00a3\u0002\u001a\u0005\u0018\u00010\u00a4\u0002H\u0016J\u0014\u0010\u00a5\u0002\u001a\u00030\u0081\u00022\b\u0010\u00a6\u0002\u001a\u00030\u00a7\u0002H\u0016J\u0013\u0010\u00a8\u0002\u001a\u00030\u0081\u00022\u0007\u0010\u00a9\u0002\u001a\u00020\u001bH\u0016J\u0016\u0010\u00aa\u0002\u001a\u00030\u0081\u00022\n\u0010\u00ab\u0002\u001a\u0005\u0018\u00010\u00a4\u0002H\u0015J\n\u0010\u00ac\u0002\u001a\u00030\u0081\u0002H\u0016J\u001e\u0010\u00ad\u0002\u001a\u00030\u0081\u00022\b\u0010\u00ae\u0002\u001a\u00030\u00af\u00022\b\u0010\u00b0\u0002\u001a\u00030\u0090\u0001H\u0017J\u0013\u0010\u00b1\u0002\u001a\u00030\u0081\u00022\u0007\u0010\u00b2\u0002\u001a\u00020uH\u0016J\n\u0010\u00b3\u0002\u001a\u00030\u0081\u0002H\u0016J\n\u0010\u00b4\u0002\u001a\u00030\u0081\u0002H\u0016J\n\u0010\u00b5\u0002\u001a\u00030\u0081\u0002H\u0007J\u001c\u0010\u00b6\u0002\u001a\u00030\u0081\u00022\u0007\u0010\u00b7\u0002\u001a\u00020i2\t\u0010\u00b8\u0002\u001a\u0004\u0018\u00010\u0012J\u0015\u0010\u00b9\u0002\u001a\u00030\u0081\u00022\t\u0010\u00ba\u0002\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010\u00bb\u0002\u001a\u00030\u0081\u0002J\n\u0010\u00bc\u0002\u001a\u00030\u0081\u0002H\u0002J\n\u0010\u00bd\u0002\u001a\u00030\u0081\u0002H\u0002J\b\u0010\u00be\u0002\u001a\u00030\u0081\u0002R\u0019\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001bX\u0084D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\u001a\u0010\"\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u0002008\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u0002068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001e\"\u0004\b=\u0010>R\u001c\u0010?\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0014\"\u0004\bA\u0010\u0016R\u001e\u0010B\u001a\u00020C8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010H\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0014\"\u0004\bJ\u0010\u0016R\u001c\u0010K\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0014\"\u0004\bM\u0010\u0016R\u001e\u0010N\u001a\u00020O8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001e\u0010T\u001a\u00020U8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001a\u0010Z\u001a\u00020[X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001e\u0010`\u001a\u00020a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001a\u0010#\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u0014\"\u0004\bg\u0010\u0016R\u001a\u0010h\u001a\u00020iX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001a\u0010n\u001a\u00020oX\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001a\u0010t\u001a\u00020uX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u001a\u0010z\u001a\u00020{X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR!\u0010\u0080\u0001\u001a\u00020a8\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010c\"\u0005\b\u0082\u0001\u0010eR\u001d\u0010\u0083\u0001\u001a\u00020\u0012X\u0086.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010\u0014\"\u0005\b\u0085\u0001\u0010\u0016R$\u0010\u0086\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R!\u0010\u008c\u0001\u001a\u00020a8\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010c\"\u0005\b\u008e\u0001\u0010eR \u0010\u008f\u0001\u001a\u00030\u0090\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u0094\u0001\u001a\u00030\u0090\u0001X\u0084\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0091\u0001\"\u0006\b\u0095\u0001\u0010\u0093\u0001R \u0010\u0096\u0001\u001a\u00030\u0090\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0091\u0001\"\u0006\b\u0097\u0001\u0010\u0093\u0001R \u0010\u0098\u0001\u001a\u00030\u0090\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0098\u0001\u0010\u0091\u0001\"\u0006\b\u0099\u0001\u0010\u0093\u0001R\u001d\u0010\u009a\u0001\u001a\u00020\u0012X\u0086.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010\u0014\"\u0005\b\u009c\u0001\u0010\u0016R\u001d\u0010\u009d\u0001\u001a\u00020\u0012X\u0086.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010\u0014\"\u0005\b\u009f\u0001\u0010\u0016R \u0010\u00a0\u0001\u001a\u00030\u00a1\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a2\u0001\u0010\u00a3\u0001\"\u0006\b\u00a4\u0001\u0010\u00a5\u0001R \u0010\u00a6\u0001\u001a\u00030\u00a7\u0001X\u0084.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a8\u0001\u0010\u00a9\u0001\"\u0006\b\u00aa\u0001\u0010\u00ab\u0001R$\u0010\u00ac\u0001\u001a\u00030\u00ad\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ae\u0001\u0010\u00af\u0001\"\u0006\b\u00b0\u0001\u0010\u00b1\u0001R \u0010\u00b2\u0001\u001a\u00030\u00b3\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b4\u0001\u0010\u00b5\u0001\"\u0006\b\u00b6\u0001\u0010\u00b7\u0001R%\u0010\u00b8\u0001\u001a\b\u0012\u0004\u0012\u00020i0&X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b9\u0001\u0010\u00ba\u0001\"\u0006\b\u00bb\u0001\u0010\u00bc\u0001R\u001d\u0010\u00bd\u0001\u001a\u00020iX\u0086.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00be\u0001\u0010k\"\u0005\b\u00bf\u0001\u0010mR\u001d\u0010\u00c0\u0001\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c1\u0001\u0010\u0014\"\u0005\b\u00c2\u0001\u0010\u0016R$\u0010\u00c3\u0001\u001a\u00030\u00c4\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00c5\u0001\u0010\u00c6\u0001\"\u0006\b\u00c7\u0001\u0010\u00c8\u0001R\u001f\u0010\u00c9\u0001\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ca\u0001\u0010\u0014\"\u0005\b\u00cb\u0001\u0010\u0016R!\u0010\u00cc\u0001\u001a\u00020O8\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cd\u0001\u0010Q\"\u0005\b\u00ce\u0001\u0010SR!\u0010\u00cf\u0001\u001a\u00020U8\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d0\u0001\u0010W\"\u0005\b\u00d1\u0001\u0010YR\u001d\u0010\u00d2\u0001\u001a\u00020iX\u0086.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d3\u0001\u0010k\"\u0005\b\u00d4\u0001\u0010mR!\u0010\u00d5\u0001\u001a\u00020O8\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d6\u0001\u0010Q\"\u0005\b\u00d7\u0001\u0010SR \u0010\u00d8\u0001\u001a\u00030\u00d9\u0001X\u0080.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00da\u0001\u0010\u00db\u0001\"\u0006\b\u00dc\u0001\u0010\u00dd\u0001R!\u0010\u00de\u0001\u001a\u00020a8\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00df\u0001\u0010c\"\u0005\b\u00e0\u0001\u0010eR$\u0010\u00e1\u0001\u001a\u00030\u00e2\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00e3\u0001\u0010\u00e4\u0001\"\u0006\b\u00e5\u0001\u0010\u00e6\u0001R\u001d\u0010\u00e7\u0001\u001a\u00020\u0012X\u0086.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e8\u0001\u0010\u0014\"\u0005\b\u00e9\u0001\u0010\u0016R$\u0010\u00ea\u0001\u001a\u00030\u00eb\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ec\u0001\u0010\u00ed\u0001\"\u0006\b\u00ee\u0001\u0010\u00ef\u0001R$\u0010\u00f0\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00f1\u0001\u0010\u0089\u0001\"\u0006\b\u00f2\u0001\u0010\u008b\u0001R\u000f\u0010\u00f3\u0001\u001a\u00020iX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u00f4\u0001\u001a\u00020a8\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00f5\u0001\u0010c\"\u0005\b\u00f6\u0001\u0010eR\u001d\u0010\u00f7\u0001\u001a\u00020\u0012X\u0086.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00f8\u0001\u0010\u0014\"\u0005\b\u00f9\u0001\u0010\u0016R$\u0010\u00fa\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00fb\u0001\u0010\u0089\u0001\"\u0006\b\u00fc\u0001\u0010\u008b\u0001R!\u0010\u00fd\u0001\u001a\u00020a8\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00fe\u0001\u0010c\"\u0005\b\u00ff\u0001\u0010e\u00a8\u0006\u00c1\u0002"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/search/PlaceSearchActivity;", "Lcom/newtaxiprime/user/appcommon/views/CommonActivity;", "Landroid/view/View$OnFocusChangeListener;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;", "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;", "Lcom/google/android/gms/maps/GoogleMap$OnCameraMoveStartedListener;", "Lcom/google/android/gms/maps/GoogleMap$OnCameraMoveListener;", "Lcom/google/android/gms/maps/GoogleMap$OnCameraMoveCanceledListener;", "Lcom/google/android/gms/maps/GoogleMap$OnCameraIdleListener;", "Lcom/newtaxiprime/user/taxiapp/views/search/GoogleMapPlaceSearchAutoCompleteRecyclerView$AutoCompleteAddressTouchListener;", "()V", "ANDROID_HTTP_CLIENT", "Landroid/net/http/AndroidHttpClient;", "kotlin.jvm.PlatformType", "getANDROID_HTTP_CLIENT", "()Landroid/net/http/AndroidHttpClient;", "Listlat", "", "getListlat", "()Ljava/lang/String;", "setListlat", "(Ljava/lang/String;)V", "Listlong", "getListlong", "setListlong", "PLAY_SERVICES_RESOLUTION_REQUEST", "", "REQUEST_CHECK_SETTINGS", "getREQUEST_CHECK_SETTINGS", "()I", "Schedule_ride", "getSchedule_ride", "setSchedule_ride", "address", "getAddress", "setAddress", "addressAutoCompletePredictions", "Ljava/util/ArrayList;", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "addressList", "", "Landroid/location/Address;", "getAddressList", "()Ljava/util/List;", "setAddressList", "(Ljava/util/List;)V", "address_search", "Landroid/widget/ScrollView;", "getAddress_search", "()Landroid/widget/ScrollView;", "setAddress_search", "(Landroid/widget/ScrollView;)V", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "counti", "getCounti", "setCounti", "(I)V", "countrys", "getCountrys", "setCountrys", "customDialog", "Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "getCustomDialog", "()Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "setCustomDialog", "(Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;)V", "date", "getDate", "setDate", "destCountry", "getDestCountry", "setDestCountry", "dest_point", "Landroid/widget/ImageView;", "getDest_point", "()Landroid/widget/ImageView;", "setDest_point", "(Landroid/widget/ImageView;)V", "destadddress", "Landroid/widget/EditText;", "getDestadddress", "()Landroid/widget/EditText;", "setDestadddress", "(Landroid/widget/EditText;)V", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "setDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "drop_done", "Landroid/widget/TextView;", "getDrop_done", "()Landroid/widget/TextView;", "setDrop_done", "(Landroid/widget/TextView;)V", "getGetAddress", "setGetAddress", "getLocations", "Lcom/google/android/gms/maps/model/LatLng;", "getGetLocations", "()Lcom/google/android/gms/maps/model/LatLng;", "setGetLocations", "(Lcom/google/android/gms/maps/model/LatLng;)V", "googleAutoCompleteToken", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "getGoogleAutoCompleteToken$app_debug", "()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "setGoogleAutoCompleteToken$app_debug", "(Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;)V", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "getGoogleMap", "()Lcom/google/android/gms/maps/GoogleMap;", "setGoogleMap", "(Lcom/google/android/gms/maps/GoogleMap;)V", "googleMapPlaceSearchAutoCompleteRecyclerView", "Lcom/newtaxiprime/user/taxiapp/views/search/GoogleMapPlaceSearchAutoCompleteRecyclerView;", "getGoogleMapPlaceSearchAutoCompleteRecyclerView$app_debug", "()Lcom/newtaxiprime/user/taxiapp/views/search/GoogleMapPlaceSearchAutoCompleteRecyclerView;", "setGoogleMapPlaceSearchAutoCompleteRecyclerView$app_debug", "(Lcom/newtaxiprime/user/taxiapp/views/search/GoogleMapPlaceSearchAutoCompleteRecyclerView;)V", "homeaddress", "getHomeaddress", "setHomeaddress", "homegettext", "getHomegettext", "setHomegettext", "homelayoyt", "Landroid/widget/LinearLayout;", "getHomelayoyt", "()Landroid/widget/LinearLayout;", "setHomelayoyt", "(Landroid/widget/LinearLayout;)V", "hometext", "getHometext", "setHometext", "isFirst", "", "()Z", "setFirst", "(Z)V", "isInternetAvailable", "setInternetAvailable", "isMapMove", "setMapMove", "isPickup", "setPickup", "lat", "getLat", "setLat", "log", "getLog", "setLog", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mGoogleApiClient", "Lcom/google/android/gms/common/api/GoogleApiClient;", "getMGoogleApiClient", "()Lcom/google/android/gms/common/api/GoogleApiClient;", "setMGoogleApiClient", "(Lcom/google/android/gms/common/api/GoogleApiClient;)V", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "mapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "getMapFragment", "()Lcom/google/android/gms/maps/SupportMapFragment;", "setMapFragment", "(Lcom/google/android/gms/maps/SupportMapFragment;)V", "markerPoints", "getMarkerPoints", "()Ljava/util/ArrayList;", "setMarkerPoints", "(Ljava/util/ArrayList;)V", "objLatLng", "getObjLatLng", "setObjLatLng", "oldstring", "getOldstring", "setOldstring", "pbAddressSearchbarLoading", "Landroid/widget/ProgressBar;", "getPbAddressSearchbarLoading", "()Landroid/widget/ProgressBar;", "setPbAddressSearchbarLoading", "(Landroid/widget/ProgressBar;)V", "pickipCountry", "getPickipCountry", "setPickipCountry", "pickup_point", "getPickup_point", "setPickup_point", "pickupaddress", "getPickupaddress", "setPickupaddress", "pickuplatlng", "getPickuplatlng", "setPickuplatlng", "pin_map", "getPin_map", "setPin_map", "placesClient", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "getPlacesClient$app_debug", "()Lcom/google/android/libraries/places/api/net/PlacesClient;", "setPlacesClient$app_debug", "(Lcom/google/android/libraries/places/api/net/PlacesClient;)V", "schedule_date_time", "getSchedule_date_time", "setSchedule_date_time", "scheduleride_layout", "Landroid/widget/RelativeLayout;", "getScheduleride_layout", "()Landroid/widget/RelativeLayout;", "setScheduleride_layout", "(Landroid/widget/RelativeLayout;)V", "searchlocation", "getSearchlocation", "setSearchlocation", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "setlocaion_onmap", "getSetlocaion_onmap", "setSetlocaion_onmap", "staticLatLng", "workaddress", "getWorkaddress", "setWorkaddress", "workgettext", "getWorkgettext", "setWorkgettext", "worklayout", "getWorklayout", "setWorklayout", "worktext", "getWorktext", "setWorktext", "arrow", "", "buildGoogleApiClient", "changeMap", "location", "Landroid/location/Location;", "checkGPSEnable", "checkPlayServices", "clearAddressAndHideRecyclerView", "destAddsFocus", "destclose", "displayLocationSettingsRequest", "context", "distance", "", "lat1", "lng1", "lat2", "lng2", "fetchAddress", "type", "fetchLocation", "addresss", "getFullAddressUsingEdittextStringFromGooglePlaceSearchAPI", "queryAddress", "hideAddressSearchProgressbar", "homeClick", "initilizeMap", "onBackPressed", "onCameraIdle", "onCameraMove", "onCameraMoveCanceled", "onCameraMoveStarted", "reason", "onConnected", "bundle", "Landroid/os/Bundle;", "onConnectionFailed", "connectionResult", "Lcom/google/android/gms/common/ConnectionResult;", "onConnectionSuspended", "i", "onCreate", "savedInstanceState", "onDestroy", "onFocusChange", "v", "Landroid/view/View;", "hasFocus", "onMapReady", "Map", "onPause", "onResume", "pickupclose", "searchItemClick", "cur_Latlng", "country", "selectedAddress", "autocompletePrediction", "showAddressSearchProgressbar", "showLocationPermissionDialog", "showPermissionDialog", "workClick", "Companion", "NameTextWatcher", "app_debug"})
public final class PlaceSearchActivity extends com.newtaxiprime.user.appcommon.views.CommonActivity implements android.view.View.OnFocusChangeListener, com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener, com.google.android.gms.maps.GoogleMap.OnCameraMoveListener, com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener, com.google.android.gms.maps.GoogleMap.OnCameraIdleListener, com.newtaxiprime.user.taxiapp.views.search.GoogleMapPlaceSearchAutoCompleteRecyclerView.AutoCompleteAddressTouchListener {
    private final android.net.http.AndroidHttpClient ANDROID_HTTP_CLIENT = null;
    public androidx.appcompat.app.AlertDialog dialog;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.utils.CommonMethods commonMethods;
    @javax.inject.Inject()
    public com.newtaxiprime.user.taxiapp.views.customize.CustomDialog customDialog;
    public java.util.List<android.location.Address> addressList;
    public java.lang.String address;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String countrys = "";
    public com.google.android.gms.maps.model.LatLng getLocations;
    public java.lang.String getAddress;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.destadddress)
    public android.widget.EditText destadddress;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.pickupaddress)
    public android.widget.EditText pickupaddress;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.dest_point)
    public android.widget.ImageView dest_point;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.pickup_point)
    public android.widget.ImageView pickup_point;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.pin_map)
    public android.widget.ImageView pin_map;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.drop_done)
    public android.widget.TextView drop_done;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.hometext)
    public android.widget.TextView hometext;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.homeaddress)
    public android.widget.TextView homeaddress;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.worktext)
    public android.widget.TextView worktext;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.workaddress)
    public android.widget.TextView workaddress;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.setlocation_onmap)
    public android.widget.LinearLayout setlocaion_onmap;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.homelayoyt)
    public android.widget.LinearLayout homelayoyt;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.worklayout)
    public android.widget.LinearLayout worklayout;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.location_placesearch)
    public androidx.recyclerview.widget.RecyclerView mRecyclerView;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.address_search)
    public android.widget.ScrollView address_search;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.schedule_date_time)
    public android.widget.TextView schedule_date_time;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.pb_address_searchbar_loading)
    public android.widget.ProgressBar pbAddressSearchbarLoading;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.scheduleride_layout)
    public android.widget.RelativeLayout scheduleride_layout;
    public com.google.android.gms.maps.SupportMapFragment mapFragment;
    public java.lang.String Schedule_ride;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date;
    private int counti = 0;
    public java.lang.String lat;
    public java.lang.String log;
    public java.lang.String homegettext;
    public java.lang.String workgettext;
    public java.lang.String searchlocation;
    public com.google.android.gms.maps.model.LatLng objLatLng;
    public com.google.android.gms.maps.GoogleMap googleMap;
    public java.lang.String Listlat;
    public java.lang.String Listlong;
    public android.content.Context mContext;
    private boolean isPickup = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pickipCountry;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String destCountry;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.google.android.gms.maps.model.LatLng> markerPoints;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String oldstring = "";
    public com.google.android.gms.maps.model.LatLng pickuplatlng;
    private boolean isFirst = true;
    private boolean isMapMove = false;
    protected com.google.android.gms.common.api.GoogleApiClient mGoogleApiClient;
    private boolean isInternetAvailable = false;
    public com.google.android.libraries.places.api.net.PlacesClient placesClient;
    private final int REQUEST_CHECK_SETTINGS = 1;
    private final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    public com.google.android.libraries.places.api.model.AutocompleteSessionToken googleAutoCompleteToken;
    public com.newtaxiprime.user.taxiapp.views.search.GoogleMapPlaceSearchAutoCompleteRecyclerView googleMapPlaceSearchAutoCompleteRecyclerView;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.google.android.libraries.places.api.model.AutocompletePrediction> addressAutoCompletePredictions = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.maps.model.LatLng staticLatLng = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.google.android.gms.maps.model.LatLngBounds BOUNDS_INDIA = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "MAP LOCATION";
    @org.jetbrains.annotations.NotNull()
    public static final com.newtaxiprime.user.taxiapp.views.search.PlaceSearchActivity.Companion Companion = null;
    
    public PlaceSearchActivity() {
        super();
    }
    
    public final android.net.http.AndroidHttpClient getANDROID_HTTP_CLIENT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AlertDialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.configs.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.utils.CommonMethods getCommonMethods() {
        return null;
    }
    
    public final void setCommonMethods(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.utils.CommonMethods p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.taxiapp.views.customize.CustomDialog getCustomDialog() {
        return null;
    }
    
    public final void setCustomDialog(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.customize.CustomDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<android.location.Address> getAddressList() {
        return null;
    }
    
    public final void setAddressList(@org.jetbrains.annotations.NotNull()
    java.util.List<android.location.Address> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountrys() {
        return null;
    }
    
    public final void setCountrys(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getGetLocations() {
        return null;
    }
    
    public final void setGetLocations(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGetAddress() {
        return null;
    }
    
    public final void setGetAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getDestadddress() {
        return null;
    }
    
    public final void setDestadddress(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getPickupaddress() {
        return null;
    }
    
    public final void setPickupaddress(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getDest_point() {
        return null;
    }
    
    public final void setDest_point(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getPickup_point() {
        return null;
    }
    
    public final void setPickup_point(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getPin_map() {
        return null;
    }
    
    public final void setPin_map(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getDrop_done() {
        return null;
    }
    
    public final void setDrop_done(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getHometext() {
        return null;
    }
    
    public final void setHometext(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getHomeaddress() {
        return null;
    }
    
    public final void setHomeaddress(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getWorktext() {
        return null;
    }
    
    public final void setWorktext(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getWorkaddress() {
        return null;
    }
    
    public final void setWorkaddress(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getSetlocaion_onmap() {
        return null;
    }
    
    public final void setSetlocaion_onmap(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getHomelayoyt() {
        return null;
    }
    
    public final void setHomelayoyt(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getWorklayout() {
        return null;
    }
    
    public final void setWorklayout(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getMRecyclerView() {
        return null;
    }
    
    public final void setMRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ScrollView getAddress_search() {
        return null;
    }
    
    public final void setAddress_search(@org.jetbrains.annotations.NotNull()
    android.widget.ScrollView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getSchedule_date_time() {
        return null;
    }
    
    public final void setSchedule_date_time(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getPbAddressSearchbarLoading() {
        return null;
    }
    
    public final void setPbAddressSearchbarLoading(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getScheduleride_layout() {
        return null;
    }
    
    public final void setScheduleride_layout(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.SupportMapFragment getMapFragment() {
        return null;
    }
    
    public final void setMapFragment(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.SupportMapFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSchedule_ride() {
        return null;
    }
    
    public final void setSchedule_ride(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getCounti() {
        return 0;
    }
    
    public final void setCounti(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLat() {
        return null;
    }
    
    public final void setLat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLog() {
        return null;
    }
    
    public final void setLog(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHomegettext() {
        return null;
    }
    
    public final void setHomegettext(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWorkgettext() {
        return null;
    }
    
    public final void setWorkgettext(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearchlocation() {
        return null;
    }
    
    public final void setSearchlocation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getObjLatLng() {
        return null;
    }
    
    public final void setObjLatLng(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.GoogleMap getGoogleMap() {
        return null;
    }
    
    public final void setGoogleMap(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getListlat() {
        return null;
    }
    
    public final void setListlat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getListlong() {
        return null;
    }
    
    public final void setListlong(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public final boolean isPickup() {
        return false;
    }
    
    public final void setPickup(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPickipCountry() {
        return null;
    }
    
    public final void setPickipCountry(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDestCountry() {
        return null;
    }
    
    public final void setDestCountry(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getMarkerPoints() {
        return null;
    }
    
    public final void setMarkerPoints(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.gms.maps.model.LatLng> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOldstring() {
        return null;
    }
    
    public final void setOldstring(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getPickuplatlng() {
        return null;
    }
    
    public final void setPickuplatlng(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    public final boolean isFirst() {
        return false;
    }
    
    public final void setFirst(boolean p0) {
    }
    
    public final boolean isMapMove() {
        return false;
    }
    
    public final void setMapMove(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.google.android.gms.common.api.GoogleApiClient getMGoogleApiClient() {
        return null;
    }
    
    protected final void setMGoogleApiClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.common.api.GoogleApiClient p0) {
    }
    
    protected final boolean isInternetAvailable() {
        return false;
    }
    
    protected final void setInternetAvailable(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.libraries.places.api.net.PlacesClient getPlacesClient$app_debug() {
        return null;
    }
    
    public final void setPlacesClient$app_debug(@org.jetbrains.annotations.NotNull()
    com.google.android.libraries.places.api.net.PlacesClient p0) {
    }
    
    protected final int getREQUEST_CHECK_SETTINGS() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.libraries.places.api.model.AutocompleteSessionToken getGoogleAutoCompleteToken$app_debug() {
        return null;
    }
    
    public final void setGoogleAutoCompleteToken$app_debug(@org.jetbrains.annotations.NotNull()
    com.google.android.libraries.places.api.model.AutocompleteSessionToken p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.taxiapp.views.search.GoogleMapPlaceSearchAutoCompleteRecyclerView getGoogleMapPlaceSearchAutoCompleteRecyclerView$app_debug() {
        return null;
    }
    
    public final void setGoogleMapPlaceSearchAutoCompleteRecyclerView$app_debug(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.search.GoogleMapPlaceSearchAutoCompleteRecyclerView p0) {
    }
    
    @butterknife.OnClick(value = {com.newtaxiprime.user.R.id.arrow})
    public final void arrow() {
    }
    
    @butterknife.OnClick(value = {com.newtaxiprime.user.R.id.pickupclose})
    public final void pickupclose() {
    }
    
    @butterknife.OnClick(value = {com.newtaxiprime.user.R.id.destclose})
    public final void destclose() {
    }
    
    @butterknife.OnClick(value = {com.newtaxiprime.user.R.id.destadddress})
    public final void destadddress() {
    }
    
    @android.annotation.SuppressLint(value = {"UseRequireInsteadOfGet"})
    public final void destAddsFocus() {
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"UseRequireInsteadOfGet"})
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Connect Google APi Client
     */
    @kotlin.jvm.Synchronized()
    protected final synchronized void buildGoogleApiClient() {
    }
    
    /**
     * Google APi on Connected
     */
    @java.lang.Override()
    public void onConnected(@org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
    
    /**
     * Google API suspended
     */
    @java.lang.Override()
    public void onConnectionSuspended(int i) {
    }
    
    /**
     * Google API connection failed
     */
    @java.lang.Override()
    public void onConnectionFailed(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.common.ConnectionResult connectionResult) {
    }
    
    private final void showPermissionDialog() {
    }
    
    private final void displayLocationSettingsRequest(android.content.Context context) {
    }
    
    public final void checkGPSEnable() {
    }
    
    private final boolean checkPlayServices() {
        return false;
    }
    
    /**
     * Move map to current location and get address while move amp
     */
    private final void changeMap(android.location.Location location) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    /**
     * function to load map. If map is not created it will create it for you
     */
    @android.annotation.SuppressLint(value = {"UseRequireInsteadOfGet"})
    private final void initilizeMap() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap Map) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.LOLLIPOP)
    public void onFocusChange(@org.jetbrains.annotations.NotNull()
    android.view.View v, boolean hasFocus) {
    }
    
    /**
     * Show GPS permission Dialog
     */
    private final void showLocationPermissionDialog() {
    }
    
    /**
     * Map Camera move listener
     */
    @java.lang.Override()
    public void onCameraMoveStarted(int reason) {
    }
    
    @java.lang.Override()
    public void onCameraMove() {
    }
    
    @java.lang.Override()
    public void onCameraMoveCanceled() {
    }
    
    @java.lang.Override()
    public void onCameraIdle() {
    }
    
    /**
     * calculates the distance between two locations in MILES
     */
    private final double distance(double lat1, double lng1, double lat2, double lng2) {
        return 0.0;
    }
    
    /**
     * Fetch Location from address if Geocode available get from geocode otherwise get location from google
     */
    public final void fetchLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String addresss, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    /**
     * Fetch address from location if Geocode available get from geocode otherwise get location from google
     */
    public final void fetchAddress(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng location, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    /**
     * Home Address click
     */
    public final void homeClick() {
    }
    
    /**
     * Work address click
     */
    public final void workClick() {
    }
    
    /**
     * Place search item click
     */
    public final void searchItemClick(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng cur_Latlng, @org.jetbrains.annotations.Nullable()
    java.lang.String country) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void selectedAddress(@org.jetbrains.annotations.Nullable()
    com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction) {
    }
    
    public final void getFullAddressUsingEdittextStringFromGooglePlaceSearchAPI(@org.jetbrains.annotations.NotNull()
    java.lang.String queryAddress) {
    }
    
    public final void hideAddressSearchProgressbar() {
    }
    
    public final void showAddressSearchProgressbar() {
    }
    
    public final void clearAddressAndHideRecyclerView() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/search/PlaceSearchActivity$Companion;", "", "()V", "BOUNDS_INDIA", "Lcom/google/android/gms/maps/model/LatLngBounds;", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J(\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J(\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/search/PlaceSearchActivity$NameTextWatcher;", "Landroid/text/TextWatcher;", "view", "Landroid/view/View;", "(Lcom/newtaxiprime/user/taxiapp/views/search/PlaceSearchActivity;Landroid/view/View;)V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "i", "", "i1", "i2", "onTextChanged", "app_debug"})
    final class NameTextWatcher implements android.text.TextWatcher {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        
        public NameTextWatcher(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super();
        }
        
        @java.lang.Override()
        public void beforeTextChanged(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence s, int i, int i1, int i2) {
        }
        
        @java.lang.Override()
        public void onTextChanged(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence s, int i, int i1, int i2) {
        }
        
        @java.lang.Override()
        public void afterTextChanged(@org.jetbrains.annotations.NotNull()
        android.text.Editable s) {
        }
    }
}