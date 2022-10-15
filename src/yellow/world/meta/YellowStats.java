package yellow.world.meta;

import mindustry.world.meta.*;

public class YellowStats{
    public static final StatCat humanInfo = new StatCat("humanInfo");
    
    public static final StatUnit yearsOld = new StatUnit("yearsOld");
    
    public static final Stat
    maxLives = new Stat("maxLives"),
    extras = new Stat("extras"),
    gender = new Stat("gender", humanInfo),
    age = new Stat("age", humanInfo),
    personality = new Stat("personality", humanInfo),
    headpatRating = new Stat("headpatRating", humanInfo),
    loveInterest = new Stat("loveInterest", humanInfo),
    generalAura = new Stat("generalAura", humanInfo),
    itemCapacityAlt = new Stat("itemCapacity"),
    weaponsAlt = new Stat("weapons"),
    rangeAlt = new Stat("range");
}
