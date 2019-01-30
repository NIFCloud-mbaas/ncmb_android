/*
 * Copyright 2017-2018 FUJITSU CLOUD TECHNOLOGIES LIMITED All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nifcloud.mbaas.core.model;

import com.google.gson.annotations.SerializedName;

public class Category {
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("importance")
    private int importance;
    @SerializedName("description")
    private String description;
    @SerializedName("enableLights")
    private boolean enableLights;
    @SerializedName("enableVibration")
    private boolean enableVibration;
    @SerializedName("lightColor")
    private int lightColor;
    @SerializedName("lockscreenVisibility")
    private int lockscreenVisibility;

    public Category() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        if (name == null || name == "") {
            name = getId();
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public String getDescription() {
        if (null == description) {
            description = "";
        }
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEnableLights() {
        return enableLights;
    }

    public void setEnableLights(boolean enableLights) {
        this.enableLights = enableLights;
    }

    public boolean isEnableVibration() {
        return enableVibration;
    }

    public void setEnableVibration(boolean enableVibration) {
        this.enableVibration = enableVibration;
    }

    public int getLightColor() {
        return lightColor;
    }

    public void setLightColor(int lightColor) {
        this.lightColor = lightColor;
    }

    public int getLockscreenVisibility() {
        return lockscreenVisibility;
    }

    public void setLockscreenVisibility(int lockscreenVisibility) {
        this.lockscreenVisibility = lockscreenVisibility;
    }

}