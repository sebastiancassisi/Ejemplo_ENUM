/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ejemploenum;

public enum UserStatus {

    PENDING("P"), ACTIVE("A"), INACTIVE("I"), DELETED("D");
    private String statusCode;

    private UserStatus(String s) {
        statusCode = s;
    }

    public String getStatusCode() {
        return statusCode;
    }
}
