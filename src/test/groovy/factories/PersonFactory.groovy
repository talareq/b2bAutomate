package groovy.factories

import groovy.Config
import groovy.page.object.models.Person

/**
 * Created by Grzegorz Gałuszka on 07.11.2017.
 */
class PersonFactory {

    private Person createEmpty() {
        return new Person()
    }

    public createUser( ){
        final Person user = this.createEmpty()
        user.setFullName(Config.getPropValue("firstAndLastName"))
        user.setCompanyName(Config.getPropValue("nameOfCompany"))
        user.setAddressLine1(Config.getPropValue("addressLine1"))
        user.setAddressLine2(Config.getPropValue("addressLine2"))
        user.setTownCity(Config.getPropValue("townCity"))
        user.setPostCode(Config.getPropValue("postcode"))
        user.setYourPosition(Config.getPropValue("yourPosition"))
        user.setPhone(Config.getPropValue("telephoneNumber"))
        user.setExtPhone(Config.getPropValue("extNumber"))
        user.setEmail(Config.getPropValue("emailAddress") + System.currentTimeMillis() +"@test.pl")
        return user
    }
}
