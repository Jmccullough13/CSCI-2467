package edu.cscc;

public class BubbleSort {
    public static void sort(String[] list) {
            boolean changed;
            do {
                changed = false;
                for (int j = 0; j <= list.length - 2; j++)
                    if (list[j].compareTo(list[j + 1]) > 0) {
                        String temp = list[j];
                        list[j] = list[j + 1];
                        list[j + 1] = temp;
                        changed = true;
                    }
            } while (changed);
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
