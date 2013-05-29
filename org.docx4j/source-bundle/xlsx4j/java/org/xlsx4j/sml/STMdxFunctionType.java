/*
 *  Copyright 2010, Plutext Pty Ltd.
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


package org.xlsx4j.sml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_MdxFunctionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_MdxFunctionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="m"/>
 *     &lt;enumeration value="v"/>
 *     &lt;enumeration value="s"/>
 *     &lt;enumeration value="c"/>
 *     &lt;enumeration value="r"/>
 *     &lt;enumeration value="p"/>
 *     &lt;enumeration value="k"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_MdxFunctionType")
@XmlEnum
public enum STMdxFunctionType {


    /**
     * Cube Member
     * 
     */
    @XmlEnumValue("m")
    M("m"),

    /**
     * Cube Value
     * 
     */
    @XmlEnumValue("v")
    V("v"),

    /**
     * Cube Set
     * 
     */
    @XmlEnumValue("s")
    S("s"),

    /**
     * Cube Set Count
     * 
     */
    @XmlEnumValue("c")
    C("c"),

    /**
     * Cube Ranked Member
     * 
     */
    @XmlEnumValue("r")
    R("r"),

    /**
     * Cube Member Property
     * 
     */
    @XmlEnumValue("p")
    P("p"),

    /**
     * Cube KPI Member
     * 
     */
    @XmlEnumValue("k")
    K("k");
    private final String value;

    STMdxFunctionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STMdxFunctionType fromValue(String v) {
        for (STMdxFunctionType c: STMdxFunctionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
