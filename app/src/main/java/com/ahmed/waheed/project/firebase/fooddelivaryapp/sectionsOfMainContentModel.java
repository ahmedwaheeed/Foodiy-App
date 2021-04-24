package com.ahmed.waheed.project.firebase.fooddelivaryapp;

import java.util.ArrayList;

public class sectionsOfMainContentModel {

    String sectionName;
    ArrayList<inSectionsContentModel> inSectionsContentModelArrayList;

    public sectionsOfMainContentModel(String sectionName, ArrayList<inSectionsContentModel> inSectionsContentModelArrayList) {
        this.sectionName = sectionName;
        this.inSectionsContentModelArrayList = inSectionsContentModelArrayList;
    }

    public ArrayList<inSectionsContentModel> getInSectionsContentModelArrayList() {
        return inSectionsContentModelArrayList;
    }

    public void setInSectionsContentModelArrayList(ArrayList<inSectionsContentModel> inSectionsContentModelArrayList) {
        this.inSectionsContentModelArrayList = inSectionsContentModelArrayList;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }
}
