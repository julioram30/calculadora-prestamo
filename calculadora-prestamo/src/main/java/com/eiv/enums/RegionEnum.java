package com.eiv.enums;

public enum RegionEnum {
    NOROESTE("NOA"), 
    NORDESTE("NEA"), 
    PAMPEANA("PAM"), 
    CUYO("CUY"), 
    PATAGONIA("PAT");

    private String region;

    private RegionEnum(String region) {
        this.region = region;
    }
    
    public String getRegion() {
        return region;
    }
    
    public static RegionEnum of(String region) {
        if (region == null) {
            
            throw new IllegalArgumentException("no puede ser nulo");
        } else if (region.trim().equalsIgnoreCase("NOA")) {
            return NOROESTE;
        } else if (region.trim().equalsIgnoreCase("NEA")) {
            return NORDESTE;
        } else if (region.trim().equalsIgnoreCase("PAM")) {
            return PAMPEANA;
        } else if (region.trim().equalsIgnoreCase("CUY")) {
            return CUYO;
        } else if (region.trim().equalsIgnoreCase("PAT")) {
            return PATAGONIA;            
        } else {
            throw new IllegalArgumentException("no se de que estas hablando willy");
        }
            
    }
}
