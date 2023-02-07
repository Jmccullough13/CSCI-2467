package edu.cscc;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

/**
 * Utility to process a document to into sorted set of unique words
 * @author Jeffrey McCullough
 */
public class UniqueWords {
    /**
     * Read file one line at a time
     * Break input String into words
     * Store unique words sorted into alphabetic order
     * @param myfile input file
     * @return sorted set of unique words
     */
    public static Set<String> processDocument(File myfile) throws FileNotFoundException {
        TreeSet<String> houseWords = new TreeSet<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(myfile))) {
            while ((line = br.readLine()) != null) {
            String[] sentence = tokenize(line);
            for (int i=0; i<sentence.length; i++) {
                String word = sentence[i];
                houseWords.add(word);
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
            return houseWords;
        }

        /**
     * Remove all punctuation and numbers from String
     * Tokenize - break into individual words
     * Convert all words to lower case
     * @param str initial non-null String
     * @return array of words from initial String
     */
    public static String[] tokenize(String str) {
        str = str.replaceAll("[^a-zA-Z \n]"," ");
        String[] tok = str.split(" ");
        for (int i=0; i<tok.length; ++i) {
            tok[i] = tok[i].toLowerCase();
        }
        return tok;
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
