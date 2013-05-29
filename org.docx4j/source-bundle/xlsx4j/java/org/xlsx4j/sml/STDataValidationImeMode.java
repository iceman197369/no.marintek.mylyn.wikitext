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
 * <p>Java class for ST_DataValidationImeMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_DataValidationImeMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="noControl"/>
 *     &lt;enumeration value="off"/>
 *     &lt;enumeration value="on"/>
 *     &lt;enumeration value="disabled"/>
 *     &lt;enumeration value="hiragana"/>
 *     &lt;enumeration value="fullKatakana"/>
 *     &lt;enumeration value="halfKatakana"/>
 *     &lt;enumeration value="fullAlpha"/>
 *     &lt;enumeration value="halfAlpha"/>
 *     &lt;enumeration value="fullHangul"/>
 *     &lt;enumeration value="halfHangul"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_DataValidationImeMode")
@XmlEnum
public enum STDataValidationImeMode {


    /**
     * IME Mode Not Controlled
     * 
     */
    @XmlEnumValue("noControl")
    NO_CONTROL("noControl"),

    /**
     * IME Off
     * 
     */
    @XmlEnumValue("off")
    OFF("off"),

    /**
     * IME On
     * 
     */
    @XmlEnumValue("on")
    ON("on"),

    /**
     * Disabled IME Mode
     * 
     */
    @XmlEnumValue("disabled")
    DISABLED("disabled"),

    /**
     * Hiragana IME Mode
     * 
     */
    @XmlEnumValue("hiragana")
    HIRAGANA("hiragana"),

    /**
     * Full Katakana IME Mode
     * 
     */
    @XmlEnumValue("fullKatakana")
    FULL_KATAKANA("fullKatakana"),

    /**
     * Half-Width Katakana
     * 
     */
    @XmlEnumValue("halfKatakana")
    HALF_KATAKANA("halfKatakana"),

    /**
     * Full-Width Alpha-Numeric IME Mode
     * 
     */
    @XmlEnumValue("fullAlpha")
    FULL_ALPHA("fullAlpha"),

    /**
     * Half Alpha IME
     * 
     */
    @XmlEnumValue("halfAlpha")
    HALF_ALPHA("halfAlpha"),

    /**
     * Full Width Hangul
     * 
     */
    @XmlEnumValue("fullHangul")
    FULL_HANGUL("fullHangul"),

    /**
     * Half-Width Hangul IME Mode
     * 
     */
    @XmlEnumValue("halfHangul")
    HALF_HANGUL("halfHangul");
    private final String value;

    STDataValidationImeMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STDataValidationImeMode fromValue(String v) {
        for (STDataValidationImeMode c: STDataValidationImeMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
