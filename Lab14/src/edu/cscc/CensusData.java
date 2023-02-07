package edu.cscc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CensusData {
    public static String[] deserialize(String fname) throws IOException, ClassNotFoundException {
        ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(fname));
        String[] names = (String[]) objIn.readObject();
        objIn.close();
        return names;
    }
}

/*
 * Copyright Notice: Columbus State Community College and its employees hold the copyright for this course material. This material is
 * made available to students for their personal use only and may not be distributed for commercial purposes without the College’s
 * express written consent. Uploading this copyrighted material to "tutoring" or other non-Columbus State web sites is prohibited and
 * may result in referral to the Office of Student Conduct and disciplinary action up to and including dismissal.
 *
 * Course ID: 40A9B085A383430396E7BACF467DE6E0
 */
