package groovy.page.object.models
/**
 * Created by Grzegorz Gałuszka on 06.11.2017.
 */
 class Person {
     private String country
     private String title
     private String fullName
     private String companyName
     private String addressLine1
     private String addressLine2
     private String townCity
     private String postCode
     private String yourPosition
     private String phone
     private String email
     private String extPhone

     String getExtPhone() {
         return extPhone
     }

     void setExtPhone(String extPhone) {
         this.extPhone = extPhone
     }

     String getCountry() {
         return country
     }

     void setCountry(String country) {
         this.country = country
     }

     String getTitle() {
         return title
     }

     void setTitle(String title) {
         this.title = title
     }

     String getFullName() {
         return fullName
     }

     void setFullName(String fullName) {
         this.fullName = fullName
     }

     String getCompanyName() {
         return companyName
     }

     void setCompanyName(String companyName) {
         this.companyName = companyName
     }

     String getAddressLine1() {
         return addressLine1
     }

     void setAddressLine1(String addressLine1) {
         this.addressLine1 = addressLine1
     }

     String getAddressLine2() {
         return addressLine2
     }

     void setAddressLine2(String addressLine2) {
         this.addressLine2 = addressLine2
     }

     String getTownCity() {
         return townCity
     }

     void setTownCity(String townCity) {
         this.townCity = townCity
     }

     String getPostCode() {
         return postCode
     }

     void setPostCode(String postCode) {
         this.postCode = postCode
     }

     String getYourPosition() {
         return yourPosition
     }

     void setYourPosition(String yourPosition) {
         this.yourPosition = yourPosition
     }

     String getPhone() {
         return phone
     }

     void setPhone(String phone) {
         this.phone = phone
     }

     String getEmail() {
         return email
     }

     void setEmail(String email) {
         this.email = email
     }

     public static class Builder {
         private final Person person

         public Builder() {
             this.person = new Person()
         }

         public Builder country(String country) {
             this.person.setCountry(country)
             return this
         }

         public Builder title(String title) {
             this.person.setTitle(title)
             return this
         }

         public Builder fullName(String fullName) {
             this.person.setFullName(fullName)
             return this
         }

         public Builder companyName(String companyName) {
             this.person.setCompanyName(companyName)
             return this
         }

         public Builder addressLine1(String addressLine1) {
             this.person.setAddressLine1(addressLine1)
             return this

         }

         public Builder addressLine2(String addressLine2) {
             this.person.setAddressLine2(addressLine2)
             return this
         }

         public Builder townCity(String townCity) {
             this.person.setTownCity(townCity)
             return this
         }

         public Builder postCode(String postCode) {
             this.person.setPostCode(postCode)
             return this
         }

         public Builder yourPosition(String yourPosition) {
             this.person.setYourPosition(yourPosition)
             return this
         }

         public Builder phone(String phone) {
             this.person.setPhone(phone)
             return this
         }

         public Builder email(String email) {
             this.person.setEmail(email)
             return this
         }

         public Builder extPhone(String extPhone){
             this.person.setExtPhone(extPhone)
             return this
         }
     }
 }
