package com.newtaxiprime.user.appcommon.configs;

/**
 * ***************************************************************
 * Session manager to set and get glopal values
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bc\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\bo\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u00a0\u0002\u001a\u00030\u00a1\u0002J\b\u0010\u00a2\u0002\u001a\u00030\u00a1\u0002J\b\u0010\u00a3\u0002\u001a\u00030\u00a1\u0002J\b\u0010\u00a4\u0002\u001a\u00030\u00a1\u0002J\b\u0010\u00a5\u0002\u001a\u00030\u00a1\u0002R(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR(\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR(\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR(\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR(\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR(\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR(\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR(\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010!\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR(\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR(\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010)\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR(\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010,\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR(\u0010/\u001a\u0004\u0018\u00010\u00042\b\u0010/\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR(\u00102\u001a\u0004\u0018\u00010\u00042\b\u00102\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR(\u00105\u001a\u0004\u0018\u00010\u00042\b\u00105\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR(\u00108\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR(\u0010;\u001a\u0004\u0018\u00010\u00042\b\u0010;\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\bR(\u0010>\u001a\u0004\u0018\u00010\u00042\b\u0010>\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b?\u0010\u0006\"\u0004\b@\u0010\bR(\u0010A\u001a\u0004\u0018\u00010\u00042\b\u0010A\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bB\u0010\u0006\"\u0004\bC\u0010\bR(\u0010E\u001a\u0004\u0018\u00010\u00042\b\u0010D\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR(\u0010H\u001a\u0004\u0018\u00010\u00042\b\u0010H\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR(\u0010L\u001a\u0004\u0018\u00010\u00042\b\u0010K\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bM\u0010\u0006\"\u0004\bN\u0010\bR(\u0010P\u001a\u0004\u0018\u00010\u00042\b\u0010O\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bQ\u0010\u0006\"\u0004\bR\u0010\bR(\u0010S\u001a\u0004\u0018\u00010\u00042\b\u0010K\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bT\u0010\u0006\"\u0004\bU\u0010\bR(\u0010W\u001a\u0004\u0018\u00010\u00042\b\u0010V\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR(\u0010Z\u001a\u0004\u0018\u00010\u00042\b\u0010Z\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\bR(\u0010^\u001a\u0004\u0018\u00010\u00042\b\u0010]\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b_\u0010\u0006\"\u0004\b`\u0010\bR(\u0010a\u001a\u0004\u0018\u00010\u00042\b\u0010a\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bb\u0010\u0006\"\u0004\bc\u0010\bR(\u0010d\u001a\u0004\u0018\u00010\u00042\b\u0010d\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\be\u0010\u0006\"\u0004\bf\u0010\bR$\u0010g\u001a\u00020h2\u0006\u0010g\u001a\u00020h8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR(\u0010n\u001a\u0004\u0018\u00010\u00042\b\u0010m\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bo\u0010\u0006\"\u0004\bp\u0010\bR(\u0010r\u001a\u0004\u0018\u00010\u00042\b\u0010q\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bs\u0010\u0006\"\u0004\bt\u0010\bR(\u0010v\u001a\u0004\u0018\u00010\u00042\b\u0010u\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bw\u0010\u0006\"\u0004\bx\u0010\bR(\u0010y\u001a\u0004\u0018\u00010z2\b\u0010y\u001a\u0004\u0018\u00010z8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\by\u0010{\"\u0004\b|\u0010}R\'\u0010\u007f\u001a\u00020z2\u0006\u0010~\u001a\u00020z8F@FX\u0086\u000e\u00a2\u0006\u000f\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R*\u0010\u0083\u0001\u001a\u00020z2\u0007\u0010\u0083\u0001\u001a\u00020z8F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u0083\u0001\u0010\u0080\u0001\"\u0006\b\u0084\u0001\u0010\u0082\u0001R*\u0010\u0085\u0001\u001a\u00020z2\u0007\u0010\u0085\u0001\u001a\u00020z8F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u0085\u0001\u0010\u0080\u0001\"\u0006\b\u0086\u0001\u0010\u0082\u0001R*\u0010\u0088\u0001\u001a\u00020z2\u0007\u0010\u0087\u0001\u001a\u00020z8F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u0088\u0001\u0010\u0080\u0001\"\u0006\b\u0089\u0001\u0010\u0082\u0001R(\u0010\u008b\u0001\u001a\u00020h2\u0007\u0010\u008a\u0001\u001a\u00020h8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008b\u0001\u0010j\"\u0005\b\u008c\u0001\u0010lR*\u0010\u008d\u0001\u001a\u00020z2\u0007\u0010\u008d\u0001\u001a\u00020z8F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u008d\u0001\u0010\u0080\u0001\"\u0006\b\u008e\u0001\u0010\u0082\u0001R*\u0010\u008f\u0001\u001a\u00020z2\u0007\u0010\u008f\u0001\u001a\u00020z8F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u0090\u0001\u0010\u0080\u0001\"\u0006\b\u0091\u0001\u0010\u0082\u0001R(\u0010\u0092\u0001\u001a\u00020h2\u0007\u0010\u0092\u0001\u001a\u00020h8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0093\u0001\u0010j\"\u0005\b\u0094\u0001\u0010lR,\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0096\u0001\u0010\u0006\"\u0005\b\u0097\u0001\u0010\bR+\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010m\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0099\u0001\u0010\u0006\"\u0005\b\u009a\u0001\u0010\bR,\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u009c\u0001\u0010\u0006\"\u0005\b\u009d\u0001\u0010\bR(\u0010\u009e\u0001\u001a\u00020h2\u0007\u0010\u009e\u0001\u001a\u00020h8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u009f\u0001\u0010j\"\u0005\b\u00a0\u0001\u0010lR(\u0010\u00a1\u0001\u001a\u00020\u00042\u0007\u0010\u00a1\u0001\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a2\u0001\u0010\u0006\"\u0005\b\u00a3\u0001\u0010\bR,\u0010\u00a4\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00a4\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a5\u0001\u0010\u0006\"\u0005\b\u00a6\u0001\u0010\bR,\u0010\u00a7\u0001\u001a\u0004\u0018\u00010z2\t\u0010\u00a7\u0001\u001a\u0004\u0018\u00010z8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a8\u0001\u0010{\"\u0005\b\u00a9\u0001\u0010}R,\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ab\u0001\u0010\u0006\"\u0005\b\u00ac\u0001\u0010\bR,\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ae\u0001\u0010\u0006\"\u0005\b\u00af\u0001\u0010\bR,\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b1\u0001\u0010\u0006\"\u0005\b\u00b2\u0001\u0010\bR,\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b4\u0001\u0010\u0006\"\u0005\b\u00b5\u0001\u0010\bR,\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b7\u0001\u0010\u0006\"\u0005\b\u00b8\u0001\u0010\bR(\u0010\u00b9\u0001\u001a\u00020h2\u0007\u0010\u00b9\u0001\u001a\u00020h8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ba\u0001\u0010j\"\u0005\b\u00bb\u0001\u0010lR(\u0010\u00bc\u0001\u001a\u00020h2\u0007\u0010\u00bc\u0001\u001a\u00020h8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00bd\u0001\u0010j\"\u0005\b\u00be\u0001\u0010lR,\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c0\u0001\u0010\u0006\"\u0005\b\u00c1\u0001\u0010\bR,\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00c2\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c4\u0001\u0010\u0006\"\u0005\b\u00c5\u0001\u0010\bR,\u0010\u00c7\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00c6\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c8\u0001\u0010\u0006\"\u0005\b\u00c9\u0001\u0010\bR,\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00ca\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00cc\u0001\u0010\u0006\"\u0005\b\u00cd\u0001\u0010\bR(\u0010\u00cf\u0001\u001a\u00020h2\u0007\u0010\u00ce\u0001\u001a\u00020h8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00d0\u0001\u0010j\"\u0005\b\u00d1\u0001\u0010lR,\u0010\u00d3\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00d2\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00d4\u0001\u0010\u0006\"\u0005\b\u00d5\u0001\u0010\bR,\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00d6\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00d8\u0001\u0010\u0006\"\u0005\b\u00d9\u0001\u0010\bR,\u0010\u00da\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00d6\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00db\u0001\u0010\u0006\"\u0005\b\u00dc\u0001\u0010\bR,\u0010\u00de\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00dd\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00df\u0001\u0010\u0006\"\u0005\b\u00e0\u0001\u0010\bR,\u0010\u00e2\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00e1\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00e3\u0001\u0010\u0006\"\u0005\b\u00e4\u0001\u0010\bR,\u0010\u00e6\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00e5\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00e7\u0001\u0010\u0006\"\u0005\b\u00e8\u0001\u0010\bR$\u0010\u00e9\u0001\u001a\u00030\u00ea\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00eb\u0001\u0010\u00ec\u0001\"\u0006\b\u00ed\u0001\u0010\u00ee\u0001R,\u0010\u00ef\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00ef\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00f0\u0001\u0010\u0006\"\u0005\b\u00f1\u0001\u0010\bR,\u0010\u00f2\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00f2\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00f3\u0001\u0010\u0006\"\u0005\b\u00f4\u0001\u0010\bR,\u0010\u00f5\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00f5\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00f6\u0001\u0010\u0006\"\u0005\b\u00f7\u0001\u0010\bR+\u0010\u00f8\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010/\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00f9\u0001\u0010\u0006\"\u0005\b\u00fa\u0001\u0010\bR,\u0010\u00fb\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00fc\u0001\u0010\u0006\"\u0005\b\u00fd\u0001\u0010\bR,\u0010\u00fe\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00fe\u0001\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ff\u0001\u0010\u0006\"\u0005\b\u0080\u0002\u0010\bR,\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u00042\t\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0082\u0002\u0010\u0006\"\u0005\b\u0083\u0002\u0010\bR,\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u00042\t\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0085\u0002\u0010\u0006\"\u0005\b\u0086\u0002\u0010\bR,\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u00042\t\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0088\u0002\u0010\u0006\"\u0005\b\u0089\u0002\u0010\bR,\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u00042\t\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008c\u0002\u0010\u0006\"\u0005\b\u008d\u0002\u0010\bR,\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u00042\t\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008f\u0002\u0010\u0006\"\u0005\b\u0090\u0002\u0010\bR,\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u00042\t\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0093\u0002\u0010\u0006\"\u0005\b\u0094\u0002\u0010\bR,\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u00042\t\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0097\u0002\u0010\u0006\"\u0005\b\u0098\u0002\u0010\bR,\u0010\u0099\u0002\u001a\u0004\u0018\u00010\u00042\t\u0010\u0099\u0002\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u009a\u0002\u0010\u0006\"\u0005\b\u009b\u0002\u0010\bR,\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u00042\t\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u009e\u0002\u0010\u0006\"\u0005\b\u009f\u0002\u0010\b\u00a8\u0006\u00a6\u0002"}, d2 = {"Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "", "()V", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "AdminContact", "adminContact", "getAdminContact", "setAdminContact", "appleid", "appleId", "getAppleId", "setAppleId", "appleLoginClientId", "getAppleLoginClientId", "setAppleLoginClientId", "bookingType", "getBookingType", "setBookingType", "BrainTreeClientToken", "brainTreeClientToken", "getBrainTreeClientToken", "setBrainTreeClientToken", "braintree_env", "getBraintree_env", "setBraintree_env", "braintree_public_key", "getBraintree_public_key", "setBraintree_public_key", "carname", "carName", "getCarName", "setCarName", "cartype", "carType", "getCarType", "setCarType", "cardBrand", "getCardBrand", "setCardBrand", "cardValue", "getCardValue", "setCardValue", "countryCode", "getCountryCode", "setCountryCode", "currency", "getCurrency", "setCurrency", "currencyCode", "getCurrencyCode", "setCurrencyCode", "currencySymbol", "getCurrencySymbol", "setCurrencySymbol", "currentAddress", "getCurrentAddress", "setCurrentAddress", "defaultPayment", "getDefaultPayment", "setDefaultPayment", "deviceId", "getDeviceId", "setDeviceId", "devicetype", "deviceType", "getDeviceType", "setDeviceType", "dialCode", "getDialCode", "setDialCode", "url", "driverId", "getDriverId", "setDriverId", "drivername", "driverName", "getDriverName", "setDriverName", "driverProfilePic", "getDriverProfilePic", "setDriverProfilePic", "ratingvalue", "driverRating", "getDriverRating", "setDriverRating", "email", "getEmail", "setEmail", "facebookid", "facebookId", "getFacebookId", "setFacebookId", "firebaseCustomToken", "getFirebaseCustomToken", "setFirebaseCustomToken", "firstName", "getFirstName", "setFirstName", "flutterwave_mode", "", "getFlutterwave_mode", "()I", "setFlutterwave_mode", "(I)V", "languagecode", "googleId", "getGoogleId", "setGoogleId", "google_map_key", "googleMapKey", "getGoogleMapKey", "setGoogleMapKey", "homeadresstext", "homeAddress", "getHomeAddress", "setHomeAddress", "isCovidFeature", "", "()Ljava/lang/Boolean;", "setCovidFeature", "(Ljava/lang/Boolean;)V", "status", "isDriverAndRiderAbleToChat", "()Z", "setDriverAndRiderAbleToChat", "(Z)V", "isFirebaseTokenUpdated", "setFirebaseTokenUpdated", "isReferralOptionEnabled", "setReferralOptionEnabled", "istrip", "isTrip", "setTrip", "isupldatelocation", "isUpdateLocation", "setUpdateLocation", "isWallet", "setWallet", "isrequest", "getIsrequest", "setIsrequest", "issignin", "getIssignin", "setIssignin", "language", "getLanguage", "setLanguage", "languageCode", "getLanguageCode", "setLanguageCode", "lastName", "getLastName", "setLastName", "mpesa_mode", "getMpesa_mode", "setMpesa_mode", "notificationID", "getNotificationID", "setNotificationID", "password", "getPassword", "setPassword", "payementModeWebView", "getPayementModeWebView", "setPayementModeWebView", "paymentMethod", "getPaymentMethod", "setPaymentMethod", "paymentMethodDetail", "getPaymentMethodDetail", "setPaymentMethodDetail", "paymentMethodImage", "getPaymentMethodImage", "setPaymentMethodImage", "paymentMethodkey", "getPaymentMethodkey", "setPaymentMethodkey", "paypal_app_id", "getPaypal_app_id", "setPaypal_app_id", "paypal_mode", "getPaypal_mode", "setPaypal_mode", "paytm_mode", "getPaytm_mode", "setPaytm_mode", "phoneNumber", "getPhoneNumber", "setPhoneNumber", "present_time_for_schedule", "presentTime", "getPresentTime", "setPresentTime", "profilearratdetail", "profileDetail", "getProfileDetail", "setProfileDetail", "gender", "profilepicture", "getProfilepicture", "setProfilepicture", "vehicleId", "promoCount", "getPromoCount", "setPromoCount", "PromoDetail", "promoDetail", "getPromoDetail", "setPromoDetail", "PushJson", "pushJson", "getPushJson", "setPushJson", "requestId", "getRequestId", "setRequestId", "date_for_schedule", "scheduleDate", "getScheduleDate", "setScheduleDate", "date_time_to_save", "scheduleDateTime", "getScheduleDateTime", "setScheduleDateTime", "ScheduledDateAndTime", "scheduledDateAndTime", "getScheduledDateAndTime", "setScheduledDateAndTime", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "sinchKey", "getSinchKey", "setSinchKey", "sinchSecret", "getSinchSecret", "setSinchSecret", "stripePublishKey", "getStripePublishKey", "setStripePublishKey", "temporaryCountryCode", "getTemporaryCountryCode", "setTemporaryCountryCode", "temporaryPhonenumber", "getTemporaryPhonenumber", "setTemporaryPhonenumber", "token", "getToken", "setToken", "tripId", "getTripId", "setTripId", "tripStatus", "getTripStatus", "setTripStatus", "type", "getType", "setType", "UserId", "userId", "getUserId", "setUserId", "walletAccount", "getWalletAccount", "setWalletAccount", "walletCard", "walletAmount", "getWalletAmount", "setWalletAmount", "walletpaymentmethod", "walletPaymentMethod", "getWalletPaymentMethod", "setWalletPaymentMethod", "walletPaymentMethodkey", "getWalletPaymentMethodkey", "setWalletPaymentMethodkey", "workadresstext", "workAddress", "getWorkAddress", "setWorkAddress", "clearAll", "", "clearDriverNameRatingAndProfilePicture", "clearPaymentType", "clearToken", "clearTripID", "app_debug"})
@kotlin.Suppress(names = {"NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS"})
public final class SessionManager {
    @javax.inject.Inject()
    public android.content.SharedPreferences sharedPreferences;
    
    public SessionManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final void setAccessToken(@org.jetbrains.annotations.Nullable()
    java.lang.String accessToken) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirebaseCustomToken() {
        return null;
    }
    
    public final void setFirebaseCustomToken(@org.jetbrains.annotations.Nullable()
    java.lang.String firebaseCustomToken) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDefaultPayment() {
        return null;
    }
    
    public final void setDefaultPayment(@org.jetbrains.annotations.Nullable()
    java.lang.String defaultPayment) {
    }
    
    public final boolean isFirebaseTokenUpdated() {
        return false;
    }
    
    public final void setFirebaseTokenUpdated(boolean isFirebaseTokenUpdated) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDialCode() {
        return null;
    }
    
    public final void setDialCode(@org.jetbrains.annotations.Nullable()
    java.lang.String dialCode) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGoogleMapKey() {
        return null;
    }
    
    public final void setGoogleMapKey(@org.jetbrains.annotations.Nullable()
    java.lang.String google_map_key) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScheduleDateTime() {
        return null;
    }
    
    public final void setScheduleDateTime(@org.jetbrains.annotations.Nullable()
    java.lang.String date_time_to_save) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScheduleDate() {
        return null;
    }
    
    public final void setScheduleDate(@org.jetbrains.annotations.Nullable()
    java.lang.String date_for_schedule) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPresentTime() {
        return null;
    }
    
    public final void setPresentTime(@org.jetbrains.annotations.Nullable()
    java.lang.String present_time_for_schedule) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCarName() {
        return null;
    }
    
    public final void setCarName(@org.jetbrains.annotations.Nullable()
    java.lang.String carname) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPushJson() {
        return null;
    }
    
    public final void setPushJson(@org.jetbrains.annotations.Nullable()
    java.lang.String PushJson) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String type) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRequestId() {
        return null;
    }
    
    public final void setRequestId(@org.jetbrains.annotations.Nullable()
    java.lang.String PushJson) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceType() {
        return null;
    }
    
    public final void setDeviceType(@org.jetbrains.annotations.Nullable()
    java.lang.String devicetype) {
    }
    
    public final boolean isDriverAndRiderAbleToChat() {
        return false;
    }
    
    public final void setDriverAndRiderAbleToChat(boolean status) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public final void setLanguage(@org.jetbrains.annotations.Nullable()
    java.lang.String language) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCarType() {
        return null;
    }
    
    public final void setCarType(@org.jetbrains.annotations.Nullable()
    java.lang.String cartype) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguageCode() {
        return null;
    }
    
    public final void setLanguageCode(@org.jetbrains.annotations.Nullable()
    java.lang.String languagecode) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBookingType() {
        return null;
    }
    
    public final void setBookingType(@org.jetbrains.annotations.Nullable()
    java.lang.String bookingType) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFacebookId() {
        return null;
    }
    
    public final void setFacebookId(@org.jetbrains.annotations.Nullable()
    java.lang.String facebookid) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppleId() {
        return null;
    }
    
    public final void setAppleId(@org.jetbrains.annotations.Nullable()
    java.lang.String appleid) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGoogleId() {
        return null;
    }
    
    public final void setGoogleId(@org.jetbrains.annotations.Nullable()
    java.lang.String languagecode) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProfilepicture() {
        return null;
    }
    
    public final void setProfilepicture(@org.jetbrains.annotations.Nullable()
    java.lang.String gender) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    public final void setCurrency(@org.jetbrains.annotations.Nullable()
    java.lang.String currency) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.Nullable()
    java.lang.String firstName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.Nullable()
    java.lang.String lastName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String password) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    public final void setPhoneNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTemporaryPhonenumber() {
        return null;
    }
    
    public final void setTemporaryPhonenumber(@org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTemporaryCountryCode() {
        return null;
    }
    
    public final void setTemporaryCountryCode(@org.jetbrains.annotations.Nullable()
    java.lang.String countryCode) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountryCode() {
        return null;
    }
    
    public final void setCountryCode(@org.jetbrains.annotations.Nullable()
    java.lang.String countryCode) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceId() {
        return null;
    }
    
    public final void setDeviceId(@org.jetbrains.annotations.Nullable()
    java.lang.String deviceId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTripId() {
        return null;
    }
    
    public final void setTripId(@org.jetbrains.annotations.Nullable()
    java.lang.String tripId) {
    }
    
    public final int isUpdateLocation() {
        return 0;
    }
    
    public final void setUpdateLocation(int isupldatelocation) {
    }
    
    public final int getIssignin() {
        return 0;
    }
    
    public final void setIssignin(int issignin) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTripStatus() {
        return null;
    }
    
    public final void setTripStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String tripStatus) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPromoDetail() {
        return null;
    }
    
    public final void setPromoDetail(@org.jetbrains.annotations.Nullable()
    java.lang.String PromoDetail) {
    }
    
    public final int getPromoCount() {
        return 0;
    }
    
    public final void setPromoCount(int vehicleId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrencyCode() {
        return null;
    }
    
    public final void setCurrencyCode(@org.jetbrains.annotations.Nullable()
    java.lang.String currencyCode) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrencySymbol() {
        return null;
    }
    
    public final void setCurrencySymbol(@org.jetbrains.annotations.Nullable()
    java.lang.String currencySymbol) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHomeAddress() {
        return null;
    }
    
    public final void setHomeAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String homeadresstext) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWorkAddress() {
        return null;
    }
    
    public final void setWorkAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String workadresstext) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProfileDetail() {
        return null;
    }
    
    public final void setProfileDetail(@org.jetbrains.annotations.Nullable()
    java.lang.String profilearratdetail) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentMethodDetail() {
        return null;
    }
    
    public final void setPaymentMethodDetail(@org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodDetail) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentMethod() {
        return null;
    }
    
    public final void setPaymentMethod(@org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentMethodkey() {
        return null;
    }
    
    public final void setPaymentMethodkey(@org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodkey) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentMethodImage() {
        return null;
    }
    
    public final void setPaymentMethodImage(@org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodImage) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWalletPaymentMethod() {
        return null;
    }
    
    public final void setWalletPaymentMethod(@org.jetbrains.annotations.Nullable()
    java.lang.String walletpaymentmethod) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWalletPaymentMethodkey() {
        return null;
    }
    
    public final void setWalletPaymentMethodkey(@org.jetbrains.annotations.Nullable()
    java.lang.String walletPaymentMethodkey) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCardValue() {
        return null;
    }
    
    public final void setCardValue(@org.jetbrains.annotations.Nullable()
    java.lang.String cardValue) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCardBrand() {
        return null;
    }
    
    public final void setCardBrand(@org.jetbrains.annotations.Nullable()
    java.lang.String cardBrand) {
    }
    
    public final boolean getIsrequest() {
        return false;
    }
    
    public final void setIsrequest(boolean isrequest) {
    }
    
    public final boolean isTrip() {
        return false;
    }
    
    public final void setTrip(boolean istrip) {
    }
    
    public final boolean isWallet() {
        return false;
    }
    
    public final void setWallet(boolean isWallet) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWalletAmount() {
        return null;
    }
    
    public final void setWalletAmount(@org.jetbrains.annotations.Nullable()
    java.lang.String walletCard) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWalletAccount() {
        return null;
    }
    
    public final void setWalletAccount(@org.jetbrains.annotations.Nullable()
    java.lang.String walletAccount) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDriverProfilePic() {
        return null;
    }
    
    public final void setDriverProfilePic(@org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDriverId() {
        return null;
    }
    
    public final void setDriverId(@org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDriverRating() {
        return null;
    }
    
    public final void setDriverRating(@org.jetbrains.annotations.Nullable()
    java.lang.String ratingvalue) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDriverName() {
        return null;
    }
    
    public final void setDriverName(@org.jetbrains.annotations.Nullable()
    java.lang.String drivername) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAdminContact() {
        return null;
    }
    
    public final void setAdminContact(@org.jetbrains.annotations.Nullable()
    java.lang.String AdminContact) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.Nullable()
    java.lang.String UserId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScheduledDateAndTime() {
        return null;
    }
    
    public final void setScheduledDateAndTime(@org.jetbrains.annotations.Nullable()
    java.lang.String ScheduledDateAndTime) {
    }
    
    public final boolean isReferralOptionEnabled() {
        return false;
    }
    
    public final void setReferralOptionEnabled(boolean isReferralOptionEnabled) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppleLoginClientId() {
        return null;
    }
    
    public final void setAppleLoginClientId(@org.jetbrains.annotations.Nullable()
    java.lang.String appleLoginClientId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSinchKey() {
        return null;
    }
    
    public final void setSinchKey(@org.jetbrains.annotations.Nullable()
    java.lang.String sinchKey) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSinchSecret() {
        return null;
    }
    
    public final void setSinchSecret(@org.jetbrains.annotations.Nullable()
    java.lang.String sinchSecret) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBrainTreeClientToken() {
        return null;
    }
    
    public final void setBrainTreeClientToken(@org.jetbrains.annotations.Nullable()
    java.lang.String BrainTreeClientToken) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String email) {
    }
    
    public final void clearToken() {
    }
    
    public final void clearPaymentType() {
    }
    
    public final void clearAll() {
    }
    
    public final void clearTripID() {
    }
    
    public final int getPaytm_mode() {
        return 0;
    }
    
    public final void setPaytm_mode(int paytm_mode) {
    }
    
    public final int getFlutterwave_mode() {
        return 0;
    }
    
    public final void setFlutterwave_mode(int flutterwave_mode) {
    }
    
    public final int getMpesa_mode() {
        return 0;
    }
    
    public final void setMpesa_mode(int mpesa_mode) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStripePublishKey() {
        return null;
    }
    
    public final void setStripePublishKey(@org.jetbrains.annotations.Nullable()
    java.lang.String stripePublishKey) {
    }
    
    public final int getPaypal_mode() {
        return 0;
    }
    
    public final void setPaypal_mode(int paypal_mode) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaypal_app_id() {
        return null;
    }
    
    public final void setPaypal_app_id(@org.jetbrains.annotations.Nullable()
    java.lang.String paypal_app_id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBraintree_public_key() {
        return null;
    }
    
    public final void setBraintree_public_key(@org.jetbrains.annotations.Nullable()
    java.lang.String braintree_public_key) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBraintree_env() {
        return null;
    }
    
    public final void setBraintree_env(@org.jetbrains.annotations.Nullable()
    java.lang.String braintree_env) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getPayementModeWebView() {
        return null;
    }
    
    public final void setPayementModeWebView(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean payementModeWebView) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentAddress() {
        return null;
    }
    
    public final void setCurrentAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String currentAddress) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isCovidFeature() {
        return null;
    }
    
    public final void setCovidFeature(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCovidFeature) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNotificationID() {
        return null;
    }
    
    public final void setNotificationID(@org.jetbrains.annotations.NotNull()
    java.lang.String notificationID) {
    }
    
    public final void clearDriverNameRatingAndProfilePicture() {
    }
}