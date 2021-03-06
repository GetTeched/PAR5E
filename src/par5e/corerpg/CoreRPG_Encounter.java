/*
 * 
 * PAR5E Fantasy Grounds Ruleset Module Parser Tool
 * Developed by Zeus. Copyright 2014
 * 
 */

package par5e.corerpg;

import java.util.LinkedHashMap;

/**
 *
 * @author zeph
 */
public class CoreRPG_Encounter extends CoreRPG_BaseClass{
    //Variables
    public String category;
    public Integer level;
    public Integer xp;
    public LinkedHashMap<String,CoreRPG_EncounterNPC> npcs;
    
    //Constructors
    public CoreRPG_Encounter() {
        name = "";
        category = "";
        npcs = new LinkedHashMap<>();
        level = -1;
        xp = -1;
    }
    public CoreRPG_Encounter(String aName) {
        name = aName;
        category = "";
        npcs = new LinkedHashMap<>();
        level = 0;
        xp = 0;
    }
    
    //Public methods
    public void setCategory(String aString) {
        category = aString;
    }
    public void setLevel(Integer aNum) {
        level = aNum;
    }
    public void setXP(Integer aNum) {
        xp = aNum;
    }
    public void setNPCs(LinkedHashMap<String,CoreRPG_EncounterNPC> aMap) {
        npcs = aMap;
    }
    public void addNPCEntry(String aName, Integer aNum, Integer aLevel) {
        CoreRPG_EncounterNPC m = new CoreRPG_EncounterNPC(aName, aNum, aLevel);
        npcs.put(aName, m);
    }
    
    public String getCategory() {
        return category;
    }
    public Integer getLevel() {
        return level;
    }
    public Integer getXP() {
        return xp;
    }
    public LinkedHashMap<String,CoreRPG_EncounterNPC> getNPCs() {
        return npcs;
    }
    @Override
    public boolean isComplete() {
        boolean complete = true;
        if (category.equals("") || level.equals(-1) || xp.equals(-1) || npcs.isEmpty()) {
            complete = false;
        }
        
        return complete;
    }    
    
}
