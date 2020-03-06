package designpattern.builder;

import java.util.Map;

public class XMLBuilder {
    private String xmlText="";
    private String header="";

    public void setXMLHeader(String version, String encoding) {
        header = "<?xml version=\"" + version + "\" encoding=\"" + encoding + "\"?>";
    }


    public static String createXMLTag(String tagName, Map<String, String> attributes, String content) {
        StringBuilder sb = new StringBuilder('<').append(tagName);
        if (attributes != null)
            for (Map.Entry<String, String> attribEntity : attributes.entrySet()) {
               // addAttribute(sb, attribEntity);
            }
        sb.append('>');
        sb.append(content);
       // addTagEnding(tagName, sb);
        return sb.toString();
    }

    public String createEmptyXMLTag(String tagName, Map<String, String> attributes) {
        StringBuilder sb = new StringBuilder('<').append(tagName);
        if (attributes != null)
            for (Map.Entry<String, String> attribEntity : attributes.entrySet()) {
                addAttribute(sb, attribEntity);
            }
        sb.append('/').append('>');
        return sb.toString();
    }

    public void addTagEnding(String tagName, StringBuilder sb) {
        sb.append('<').append('/').append(tagName).append('>');
    }

    public void addAttribute(StringBuilder sb, Map.Entry<String, String> attribEntity) {
        sb.append(' ').append(attribEntity.getKey()).append('=').append('"').append(attribEntity.getValue()).append('"');
    }

    public String getXMLDoc() {
        return header+xmlText;
    }
}