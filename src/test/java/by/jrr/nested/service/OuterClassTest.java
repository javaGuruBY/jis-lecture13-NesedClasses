package by.jrr.nested.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OuterClassTest {

    OuterClass outerClass;
    OuterClass.StaticNestedClass staticNestedClass;
    OuterClass.InnerClass innerClass;

    @Before
    public void setup() {
        outerClass = new OuterClass();
        staticNestedClass = new OuterClass.StaticNestedClass();
        innerClass = outerClass.new InnerClass();
    }

    @Test
    public void creation() {
        OuterClass outerClass = new OuterClass();

        OuterClass.StaticNestedClass staticNestedClass1 = new OuterClass.StaticNestedClass();
//        OuterClass.StaticNestedClass staticNestedClass2 = outerClass.new StaticNestedClass(); //error

//        OuterClass.InnerClass innerClass1 = new OuterClass.InnerClass(); //error
        OuterClass.InnerClass innerClass2 = outerClass.new InnerClass();
    }

    @Test
    public void accessToPlainFieldMethod() {
        outerClass.getOuterName();
        staticNestedClass.getStaticNestedName();
        innerClass.getInnerName();

        var v = outerClass.outerName;
        var a = staticNestedClass.staticNestedName;
        var i = innerClass.innerName;

    }

    @Test
    public void accessToStaticField() {
        String access;
        access = OuterClass.OUTER_STATIC_FIELD;
        access = OuterClass.StaticNestedClass.STATIC_NESTED_STATIC_FIELD;
        access = OuterClass.InnerClass.INNER_STATIC_FIELD;
    }

    @Test
    public void accessToStaticWithMethod() {

        outerClass.getOuterStaticField();
        OuterClass.getOuterStaticFieldWithStatic();

        outerClass.getStaticNestedFieldWithNonStaticMethod();
        OuterClass.getStaticNestedField();

        outerClass.getInnerStaticField();
        OuterClass.getInnerStaticFieldWithStatic();

        staticNestedClass.getStaticField();
        OuterClass.StaticNestedClass.getStaticFieldWithStatic();

        innerClass.getStaticField();
//        OuterClass.InnerClass.getStaticFieldWithStatic(); //not possible
    }






}
