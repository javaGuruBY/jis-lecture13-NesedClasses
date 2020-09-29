package by.jrr.nested.service;

import lombok.Data;

import java.util.LinkedList;

@Data
public class OuterClass {
    public String outerName;
    public static String outerStaticField;
    public static final String OUTER_STATIC_FIELD = "";

    public String getOuterStaticField() {
        return outerStaticField;
    }
    public static String getOuterStaticFieldWithStatic() {
        return outerStaticField;
    }

    public static String getStaticNestedField() {
        return StaticNestedClass.staticNestedStaticField;
    }
    public String getStaticNestedFieldWithNonStaticMethod() {
        return StaticNestedClass.staticNestedStaticField;
    }

    public String getInnerStaticField() {
        return InnerClass.innerStaticField;
    }
    public static String getInnerStaticFieldWithStatic() {
        return InnerClass.innerStaticField;
    }

    @Data
    public static class StaticNestedClass {
        public String staticNestedName;
        public static String staticNestedStaticField;
        public static final String STATIC_NESTED_STATIC_FIELD = "";

        public String getStaticField() {
            return staticNestedStaticField;
        }
        public static String getStaticFieldWithStatic() {
            return staticNestedStaticField;
        }
    }

    @Data
    public class InnerClass {
        public String innerName;
        public static final String innerStaticField = "";
        public static final String INNER_STATIC_FIELD = "";

        public String getStaticField() {
            return innerStaticField;
        }
    }
}
