/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.dml.diagram;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ConnectorPoint.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ConnectorPoint">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="auto"/>
 *     &lt;enumeration value="bCtr"/>
 *     &lt;enumeration value="ctr"/>
 *     &lt;enumeration value="midL"/>
 *     &lt;enumeration value="midR"/>
 *     &lt;enumeration value="tCtr"/>
 *     &lt;enumeration value="bL"/>
 *     &lt;enumeration value="bR"/>
 *     &lt;enumeration value="tL"/>
 *     &lt;enumeration value="tR"/>
 *     &lt;enumeration value="radial"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_ConnectorPoint")
@XmlEnum
public enum STConnectorPoint {


    /**
     * Auto
     * 
     */
    @XmlEnumValue("auto")
    AUTO("auto"),

    /**
     * Bottom Center
     * 
     */
    @XmlEnumValue("bCtr")
    B_CTR("bCtr"),

    /**
     * Center
     * 
     */
    @XmlEnumValue("ctr")
    CTR("ctr"),

    /**
     * Middle Left
     * 
     */
    @XmlEnumValue("midL")
    MID_L("midL"),

    /**
     * Middle Right
     * 
     */
    @XmlEnumValue("midR")
    MID_R("midR"),

    /**
     * Top Center
     * 
     */
    @XmlEnumValue("tCtr")
    T_CTR("tCtr"),

    /**
     * Bottom Left
     * 
     */
    @XmlEnumValue("bL")
    B_L("bL"),

    /**
     * Bottom Right
     * 
     */
    @XmlEnumValue("bR")
    B_R("bR"),

    /**
     * Top Left
     * 
     */
    @XmlEnumValue("tL")
    T_L("tL"),

    /**
     * Top Right
     * 
     */
    @XmlEnumValue("tR")
    T_R("tR"),

    /**
     * Radial
     * 
     */
    @XmlEnumValue("radial")
    RADIAL("radial");
    private final String value;

    STConnectorPoint(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STConnectorPoint fromValue(String v) {
        for (STConnectorPoint c: STConnectorPoint.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
