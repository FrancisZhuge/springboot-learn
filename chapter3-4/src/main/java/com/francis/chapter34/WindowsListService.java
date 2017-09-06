package com.francis.chapter34;

public class WindowsListService implements ListService{
    @Override
    public String showListCmd() {
        return "dir";
    }
}
