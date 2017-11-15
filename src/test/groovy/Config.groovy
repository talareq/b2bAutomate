package groovy

class Config {

    static String getPropValue(String key) throws IOException {
        def properties = new Properties()
        def resource = this.getClass().getResource('/config.properties')
        resource.withInputStream {properties.load(it)}
        return properties.getProperty(key)

    }
}
