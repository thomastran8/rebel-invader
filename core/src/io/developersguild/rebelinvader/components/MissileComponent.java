package io.developersguild.rebelinvader.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.ashley.core.Entity;

/**
 * Created by thomastran on 3/4/2016.
 */
public class MissileComponent implements Component {
    public static final float WIDTH = 0.25f;
    public static final float HEIGHT = 0.5f;
    public static final float PLAYER_MISSILE_VELOCITY = 250f;
    public static final int STATE_NORMAL = 0;
    public static final int STATE_HIT = 1;

    public static final float COOLDOWN = 10.0f;
    public static final float MISSILE_DAMAGE = 50f;
    public static final float REMOVAL_TIME = 3.0f;
    public static boolean hasLaunched = false;
    public float currentTime = 0.0f;

    public float accelerator = 0.0f;

    public Entity origin;
}
