package com.consol.citrus.annotations;

import java.lang.annotation.*;

/**
 * Citrus test case annotation used for XML test case definition inside a unit test class.
 * Each method annotated with this annotation will result in a separate test execution.
 *
 * @author Christoph Deppisch
 * @since 1.3.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CitrusXmlTest {
    /** Test name optional -  by default method name is used as test name */
    public String[] names() default {};

    /** Test package name optional -  by default package of declaring test class is used */
    public String packageName() default "";

    /** Enable/disable test case in annotation */
    public boolean enabled() default true;

    /** Test packages to scan for XML test case definitions */
    public String[] packagesToScan() default {};

}
