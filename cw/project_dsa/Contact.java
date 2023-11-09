/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package cw.project_dsa;

/**
 *
 * @author ogena
 */
public class Contact {
    
    String name;
    String phone_number;
    Contact left;
    Contact right;
    
    public Contact(String name, String phone_number) {
        this.name = name;
        this.phone_number = phone_number;
        left = null;
        right = null;
    }
}