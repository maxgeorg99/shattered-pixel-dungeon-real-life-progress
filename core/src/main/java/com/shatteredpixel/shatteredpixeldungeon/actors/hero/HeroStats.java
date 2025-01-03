package com.shatteredpixel.shatteredpixeldungeon.actors.hero;

public class HeroStats {
    // Base stats
    private float baseSpeed = 1f;
    private int baseStr = 10;
    private int baseAttackSkill = 10;
    private int baseDefenseSkill = 5;
    private int baseHT = 20;
    private float baseAccuracy = 1;
    private float baseEvasion = 1;

    public HeroStats() {
    }

    public HeroStats(float baseSpeed, int baseStr, int baseAttackSkill, int baseDefenseSkill, int baseHT, float baseAccuracy, float baseEvasion) {
        this.baseSpeed = baseSpeed;
        this.baseStr = baseStr;
        this.baseAttackSkill = baseAttackSkill;
        this.baseDefenseSkill = baseDefenseSkill;
        this.baseHT = baseHT;
        this.baseAccuracy = baseAccuracy;
        this.baseEvasion = baseEvasion;
    }

    public float getBaseSpeed() {
        return baseSpeed;
    }

    public int getBaseStr() {
        return baseStr;
    }

    public int getBaseAttackSkill() {
        return baseAttackSkill;
    }

    public int getBaseDefenseSkill() {
        return baseDefenseSkill;
    }

    public int getBaseHT() {
        return baseHT;
    }

    public float getBaseAccuracy() {
        return baseAccuracy;
    }

    public float getBaseEvasion() {
        return baseEvasion;
    }
}