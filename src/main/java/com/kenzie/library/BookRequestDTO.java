package com.kenzie.library;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.*;


@JsonIgnoreProperties(ignoreUnknown = true)
public class BookRequestDTO{
        @com.fasterxml.jackson.annotation.JsonProperty("numFoundExact")
        private boolean numfoundexact;
        @com.fasterxml.jackson.annotation.JsonProperty("start")
        private int start;
        @com.fasterxml.jackson.annotation.JsonProperty("numFound")
        private int numfound;
        @com.fasterxml.jackson.annotation.JsonProperty("docs")
        private ArrayList<documentDTO> docs;


        public ArrayList<documentDTO> getDocs() {
                return docs;
        }
        public void setDocs(ArrayList<documentDTO> docs) {
                this.docs = docs;
        }

        public int getNumFound() {
                return numfound;
        }
        public void setNumFound(int numfound) {
                this.numfound = numfound;
        }

}


