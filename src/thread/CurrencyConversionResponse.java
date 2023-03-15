/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author KEL KALKUL
 */
public class CurrencyConversionResponse {

    private String base;
    private String date;
    private Map<String, String> rates = new TreeMap<>();

    public Map<String, String> getRates() {
        return rates;
    }

    public void setRtaes(Map<String, String> rates) {
        this.rates = rates;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
