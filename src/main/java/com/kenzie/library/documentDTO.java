package com.kenzie.library;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class documentDTO {

    @com.fasterxml.jackson.annotation.JsonProperty("subject_facet")
    private java.util.List<String> subjectFacet;
    @com.fasterxml.jackson.annotation.JsonProperty("person_facet")
    private java.util.List<String> personFacet;
    @com.fasterxml.jackson.annotation.JsonProperty("time_facet")
    private java.util.List<String> timeFacet;
    @com.fasterxml.jackson.annotation.JsonProperty("place_key")
    private java.util.List<String> placeKey;
    @com.fasterxml.jackson.annotation.JsonProperty("person_key")
    private java.util.List<String> personKey;
    @com.fasterxml.jackson.annotation.JsonProperty("publisher_facet")
    private java.util.List<String> publisherFacet;
    @com.fasterxml.jackson.annotation.JsonProperty("ia_box_id")
    private java.util.List<String> iaBoxId;
    @com.fasterxml.jackson.annotation.JsonProperty("ia_loaded_id")
    private java.util.List<String> iaLoadedId;
    @com.fasterxml.jackson.annotation.JsonProperty("id_wikidata")
    private java.util.List<String> idWikidata;
    @com.fasterxml.jackson.annotation.JsonProperty("id_overdrive")
    private java.util.List<String> idOverdrive;
    @com.fasterxml.jackson.annotation.JsonProperty("id_libris")
    private java.util.List<String> idLibris;
    @com.fasterxml.jackson.annotation.JsonProperty("id_librarything")
    private java.util.List<String> idLibrarything;
    @com.fasterxml.jackson.annotation.JsonProperty("id_google")
    private java.util.List<String> idGoogle;
    @com.fasterxml.jackson.annotation.JsonProperty("id_goodreads")
    private java.util.List<String> idGoodreads;
    @com.fasterxml.jackson.annotation.JsonProperty("id_dnb")
    private java.util.List<String> idDnb;
    @com.fasterxml.jackson.annotation.JsonProperty("id_depósito_legal")
    private java.util.List<String> idDepósitoLegal;
    @com.fasterxml.jackson.annotation.JsonProperty("id_bcid")
    private java.util.List<String> idBcid;
    @com.fasterxml.jackson.annotation.JsonProperty("id_amazon")
    private java.util.List<String> idAmazon;
    @com.fasterxml.jackson.annotation.JsonProperty("id_alibris_id")
    private java.util.List<String> idAlibrisId;
    @com.fasterxml.jackson.annotation.JsonProperty("time")
    private java.util.List<String> time;
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    private java.util.List<String> subject;
    @com.fasterxml.jackson.annotation.JsonProperty("place")
    private java.util.List<String> place;
    @com.fasterxml.jackson.annotation.JsonProperty("person")
    private java.util.List<String> person;
    @com.fasterxml.jackson.annotation.JsonProperty("author_alternative_name")
    private java.util.List<String> authorAlternativeName;
    @com.fasterxml.jackson.annotation.JsonProperty("author_name")
    private java.util.List<String> authorName;
    @com.fasterxml.jackson.annotation.JsonProperty("author_key")
    private java.util.List<String> authorKey;
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    private java.util.List<String> language;
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    private java.util.List<String> publisher;
    @com.fasterxml.jackson.annotation.JsonProperty("first_sentence")
    private java.util.List<String> firstSentence;
    @com.fasterxml.jackson.annotation.JsonProperty("cover_i")
    private int coverI;
    @com.fasterxml.jackson.annotation.JsonProperty("cover_edition_key")
    private String coverEditionKey;
    @com.fasterxml.jackson.annotation.JsonProperty("printdisabled_s")
    private String printdisabledS;
    @com.fasterxml.jackson.annotation.JsonProperty("lending_identifier_s")
    private String lendingIdentifierS;
    @com.fasterxml.jackson.annotation.JsonProperty("lending_edition_s")
    private String lendingEditionS;
    @com.fasterxml.jackson.annotation.JsonProperty("ia_collection_s")
    private String iaCollectionS;
    @com.fasterxml.jackson.annotation.JsonProperty("public_scan_b")
    private boolean publicScanB;
    @com.fasterxml.jackson.annotation.JsonProperty("ia")
    private java.util.List<String> ia;
    @com.fasterxml.jackson.annotation.JsonProperty("ebook_count_i")
    private int ebookCountI;
    @com.fasterxml.jackson.annotation.JsonProperty("last_modified_i")
    private int lastModifiedI;
    @com.fasterxml.jackson.annotation.JsonProperty("isbn")
    private java.util.List<String> isbn;
    @com.fasterxml.jackson.annotation.JsonProperty("ddc")
    private java.util.List<String> ddc;
    @com.fasterxml.jackson.annotation.JsonProperty("lcc")
    private java.util.List<String> lcc;
    @com.fasterxml.jackson.annotation.JsonProperty("contributor")
    private java.util.List<String> contributor;
    @com.fasterxml.jackson.annotation.JsonProperty("oclc")
    private java.util.List<String> oclc;
    @com.fasterxml.jackson.annotation.JsonProperty("publish_place")
    private java.util.List<String> publishPlace;
    @com.fasterxml.jackson.annotation.JsonProperty("lccn")
    private java.util.List<String> lccn;
    @com.fasterxml.jackson.annotation.JsonProperty("number_of_pages_median")
    private int numberOfPagesMedian;
    @com.fasterxml.jackson.annotation.JsonProperty("first_publish_year")
    private int firstPublishYear;
    @com.fasterxml.jackson.annotation.JsonProperty("publish_year")
    private java.util.List<Integer> publishYear;
    @com.fasterxml.jackson.annotation.JsonProperty("publish_date")
    private java.util.List<String> publishDate;
    @com.fasterxml.jackson.annotation.JsonProperty("edition_key")
    private java.util.List<String> editionKey;
    @com.fasterxml.jackson.annotation.JsonProperty("edition_count")
    private int editionCount;
    @com.fasterxml.jackson.annotation.JsonProperty("has_fulltext")
    private boolean hasFulltext;
    @com.fasterxml.jackson.annotation.JsonProperty("title_suggest")
    private String titleSuggest;
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private String title;
    @com.fasterxml.jackson.annotation.JsonProperty("seed")
    private java.util.List<String> seed;
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private String type;
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private String key;

    public List<String> getSubject() {
        return subject;
    }

    public List<String> getAuthorName() {
        return authorName;
    }

    public List<String> getAuthorKey() {
        return authorKey;
    }

    public int getFirstPublishYear() {
        return firstPublishYear;
    }

    public String getTitle() {
        return title;
    }

    public String getKey() {
        return key;
    }

    public List<String> getIsbn() {
        return isbn;
    }

    public List<String> getIdAmazon() {
        return idAmazon;
    }

}
