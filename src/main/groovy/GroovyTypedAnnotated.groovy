@Typed
class GroovyTypedAnnotated {
    def execute() {
        def startTime = System.currentTimeMillis()
        double val
        for (i in 0..<100000) {
            def t1 = System.currentTimeMillis()
            def valTmp = i / t1 + Random.newInstance().nextDouble()
            if (val < valTmp) {
                val = valTmp
            }
        }
        System.currentTimeMillis()-startTime
    }
}