import org.junit.Test


class GroovySpeedTest {
    @Test
    public void sayHello() {
        def annotated = new GroovyTypedAnnotated()
        def dynamic = new GroovyDynamic()

        def typedExcutionTime = annotated.execute()
        def dynamicExcutionTime = dynamic.execute()

        dynamicExcutionTime = dynamic.execute()
        typedExcutionTime = annotated.execute()

        assert dynamicExcutionTime != null
        assert typedExcutionTime != null
        println "dynamic: $dynamicExcutionTime \ntyped  : $typedExcutionTime"
    }

}