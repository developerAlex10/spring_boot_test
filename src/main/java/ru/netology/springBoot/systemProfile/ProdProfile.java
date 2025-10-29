package ru.netology.springBoot.systemProfile;

public class ProdProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is prod";
    }
}
