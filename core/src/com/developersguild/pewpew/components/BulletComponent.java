package com.developersguild.pewpew.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.ashley.core.Entity;

/**
 * Created by Vihan on 2/9/2016.
 */
public class BulletComponent implements Component {
    public static final float WIDTH = 0.2f;
    public static final float HEIGHT = 0.2f;
    public static final float VELOCITY = 1000f;
    public static final int STATE_NORMAL = 0;
    public static final int STATE_HIT = 1;

    public Entity origin;
}
