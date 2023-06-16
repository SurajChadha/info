importjava.util.ArrayList;
importjava.util.HashMap;

public classContact{

    Contact(Stringid) {
        this.identifier= id;
    }

    privateContact() {
    }

    Stringidentifier;
    StringdisplayName, givenName, middleName, familyName, prefix, suffix, company, jobTitle, note;
    ArrayList<Item> emails= newArrayList<>();
    ArrayList<Item> phones= newArrayList<>();
    ArrayList<PostalAddress> postalAddresses= newArrayList<>();
    byte[] avatar= newbyte[0];

    HashMap<String, Object> toMap() {
        HashMap<String, Object> contactMap= newHashMap<>();
        contactMap.put("identifier", identifier);
        contactMap.put("displayName", displayName);
        contactMap.put("givenName", givenName);
        contactMap.put("middleName", middleName);
        contactMap.put("familyName", familyName);
        contactMap.put("prefix", prefix);
        contactMap.put("suffix", suffix);
        contactMap.put("company", company);
        contactMap.put("jobTitle", jobTitle);
        contactMap.put("avatar", avatar);
        contactMap.put("note", note);

        ArrayList<HashMap<String, String>> emailsMap= newArrayList<>();
        for(Itememail: emails) {
            emailsMap.add(email.toMap());
        }
        contactMap.put("emails", emailsMap);

        ArrayList<HashMap<String, String>> phonesMap= newArrayList<>();
        for(Itemphone: phones) {
            phonesMap.add(phone.toMap());
        }
        contactMap.put("phones", phonesMap);

        ArrayList<HashMap<String, String>> addressesMap= newArrayList<>();
        for(PostalAddressaddress: postalAddresses) {
            addressesMap.add(address.toMap());
        }
        contactMap.put("postalAddresses", addressesMap);

        returncontactMap;
    }

    @SuppressWarnings("unchecked")
    staticContactfromMap(HashMapmap) {
        Contactcontact= newContact();
        contact.identifier= (String) map.get("identifier");
        contact.givenName= (String) map.get("givenName");
        contact.middleName= (String) map.get("middleName");
        contact.familyName= (String) map.get("familyName");
        contact.prefix= (String) map.get("prefix");
        contact.suffix= (String) map.get("suffix");
        contact.company= (String) map.get("company");
        contact.jobTitle= (String) map.get("jobTitle");
        contact.avatar= (byte[]) map.get("avatar");
        contact.note= (String) map.get("note");

        ArrayList<HashMap> emails= (ArrayList<HashMap>) map.get("emails");
        if(emails!= null) {
            for(HashMapemail: emails) {
                contact.emails.add(Item.fromMap(email));
            }
        }
        ArrayList<HashMap> phones= (ArrayList<HashMap>) map.get("phones");
        if(phones!= null) {
            for(HashMapphone: phones) {
                contact.phones.add(Item.fromMap(phone));
            }
        }
        ArrayList<HashMap> postalAddresses= (ArrayList<HashMap>) map.get("postalAddresses");
        if(postalAddresses!= null) {
            for(HashMappostalAddress: postalAddresses) {
                contact.postalAddresses.add(PostalAddress.fromMap(postalAddress));
            }
        }
        returncontact;
    }
}








