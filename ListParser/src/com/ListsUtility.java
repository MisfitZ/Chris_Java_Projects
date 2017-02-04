/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.ArrayList;

/**
 *
 * @author jerem
 */
public class ListsUtility {
    public ArrayList<String> GetCustomList(ArrayList<String> ipArray,
                                           String ipItemInList)
    {
        ArrayList<String> newArray;
        newArray = new ArrayList<>();
        
        ipArray.stream().filter((item) -> (item.toLowerCase().startsWith(ipItemInList.toLowerCase()))).forEach((item) -> 
        {
            newArray.add(item);
        });
        
        return newArray; 
    }
}
