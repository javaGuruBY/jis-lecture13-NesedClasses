package by.jrr.nested.service;


public class OuterClassWithPrivate {
    private String outerName;
    private static String outerStaticField;
    private static final String OUTER_STATIC_FIELD = "";

    private void hasAccessStaticFields() {
        String access;

        access = OuterClass.outerStaticField;
        access = StaticNestedClass.staticNestedStaticField;
        access = InnerClass.innerStaticField;

        access = OuterClass.OUTER_STATIC_FIELD;
        access = StaticNestedClass.STATIC_NESTED_STATIC_FIELD;
        access = InnerClass.INNER_STATIC_FIELD;

    }

    private void hasAccessPlainField() {
        OuterClassWithPrivate outerClassWithPrivate = new OuterClassWithPrivate();
        StaticNestedClass staticNestedClass = new StaticNestedClass();
        InnerClass innerClass = new InnerClass();

        var a = outerClassWithPrivate.outerName;
        var b = staticNestedClass.staticNestedName;
        var c = innerClass.innerName;
    }


    private static class StaticNestedClass {
        private String staticNestedName;
        private static String staticNestedStaticField;
        private static final String STATIC_NESTED_STATIC_FIELD = "";

        private void hasAccessStaticFields() {
            String access;

            access = OuterClass.outerStaticField;
            access = StaticNestedClass.staticNestedStaticField;
            access = InnerClass.innerStaticField;

            access = OuterClass.OUTER_STATIC_FIELD;
            access = StaticNestedClass.STATIC_NESTED_STATIC_FIELD;
            access = InnerClass.INNER_STATIC_FIELD;
        }

        private void hasAccessPlainField() {
            OuterClassWithPrivate outerClassWithPrivate = new OuterClassWithPrivate();
            StaticNestedClass staticNestedClass = new StaticNestedClass();
//            InnerClass innerClass = new InnerClass();  // error
            InnerClass innerClass = outerClassWithPrivate.new InnerClass();

            var a = outerClassWithPrivate.outerName;
            var b = staticNestedClass.staticNestedName;
            var c = innerClass.innerName;
        }
    }

    private class InnerClass {
        private String innerName;
        private static final String innerStaticField = "";
        private static final String INNER_STATIC_FIELD = "";

        private void hasAccessStaticFields() {
            String access;

            access = OuterClass.outerStaticField;
            access = StaticNestedClass.staticNestedStaticField;
            access = InnerClass.innerStaticField;

            access = OuterClass.OUTER_STATIC_FIELD;
            access = StaticNestedClass.STATIC_NESTED_STATIC_FIELD;
            access = InnerClass.INNER_STATIC_FIELD;
        }

        private void hasAccessPlainField() {
            OuterClassWithPrivate outerClassWithPrivate = new OuterClassWithPrivate();
            StaticNestedClass staticNestedClass = new StaticNestedClass();
            InnerClass innerClass = new InnerClass();

            var a = outerClassWithPrivate.outerName;
            var b = staticNestedClass.staticNestedName;
            var c = innerClass.innerName;
        }
    }
}
