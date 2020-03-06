package designpattern.builder;

import java.util.HashMap;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 10:04:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class PeopleDataSource {
    XMLBuilder builder;
    public String getPeopleXml(List<Person> persons) {
        builder = new XMLBuilder();
        builder.setXMLHeader("1.0","UTF-8");

        addPersons(persons);

        return builder.getXMLDoc();
    }

    private void addPersons(List<Person> persons) {
        for (Person person : persons) {
            addPerson(person);
        }
    }

    private void addPerson(Person person) {
        HashMap<String,String> properties=new HashMap<String, String>();
        properties.put("id", String.valueOf(person.getId()));
        properties.put("name", person.getName());
/*
        String content=addAddress(person);

        return builder.addEntity("Person", properties, content);
*/
    }

    private void addAddress(Person person) {
/*
        builder.addEntity("Address", null,);
        builder.addEntity("City", null, person.getCity());
        builder.addEntity("Country", null, person.getCountry());
        return XMLBuilder.createXMLTag("Address", null, content);
*/
    }

    private void addPeopleTag(List<Person> persons) {
        HashMap<String, String> attributes = new HashMap<String, String>();
        attributes.put("number",String.valueOf(persons.size()));
//        builder.addEntity("People",attributes);

    }
}
