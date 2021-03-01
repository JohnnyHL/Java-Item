package com.hl.magic.base.oop.character02;

/**
 * @author hl
 */
public class PackageWoman {

    private String name;

    private PackageMan husband;

    public PackageWoman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PackageMan getHusband() {
        return husband;
    }

    public void setHusband(PackageMan husband) {
        this.husband = husband;
    }
}
