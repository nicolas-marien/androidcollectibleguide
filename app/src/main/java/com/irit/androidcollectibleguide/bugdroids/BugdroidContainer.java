package com.irit.androidcollectibleguide.bugdroids;

import android.content.res.Resources;

import com.irit.androidcollectibleguide.R;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Nicolas on 18/06/2014.
 */
public class BugdroidContainer {

    private final List<AbstractBugdroid> mBugdroids;
    private Resources mRes;

    /*
        The different possible tags
     */
    public static final String SERIES_ONE_TAG = "SERIES ONE";
    public static final String SERIES_TWO_TAG = "SERIES TWO";
    public static final String SERIES_THREE_TAG = "SERIES THREE";
    public static final String SERIES_FOUR_TAG = "SERIES FOUR";
    public static final String LUCKY_CATS_TAG = "LUCKY CAT";
    public static final String SPECIAL_EDITION_TAG = "SPECIAL EDITION";
    public static final String BIG_BOX_EDITION_TAG = "BIG BOX EDITION";
    public static final String GOOGLE_EDITION_TAG = "GOOGLE EDITION";

    /*
        The different Artist
     */
    private static final String ANDREW_BELL = "Andrew Bell";
    private static final String GOOGLE_INC = "Google Inc.";
    private static final String SCOTT_TOLLESON = "Scott Tolleson";
    private static final String GARY_HAM = "Gary Ham";
    private static final String JEFF_YAKSICK = "Jeff Yaksick";
    private static final String DOKTOR_A = "Doktor A";
    private static final String MAD = "MAD";
    private static final String SKET_ONE = "Sket One";
    private static final String KRONK = "Kronk";
    private static final String KANO = "kaNO";
    private static final String KELLY_DENATO = "Kelly Denato";
    private static final String HUCK_GEE = "Huck Gee";
    private static final String KONG_ANDRI = "Kong Andri";
    private static final String SERGIO_MANCINI = "Sergio Mancini";
    private static final String SHAWNIMALS = "Shawnimal's";
    private static final String FAKIR = "Fakir";
    private static final String SHANE_JESSUP = "Shane Jessup";

    public BugdroidContainer(Resources res) {
        mRes = res;
        mBugdroids = this.initBugdroids();
    }

    /**
     * Populate a list with all the existing bugdroids
     * @return a list with all the existing bugdroids
     */
    private ArrayList<AbstractBugdroid> initBugdroids() {
        ArrayList<AbstractBugdroid> list = new ArrayList<AbstractBugdroid>();
        setupSeriesBugdroids(list);
        setupLuckyCats(list);
        setupBigBoxEdition(list);
        setupSpecialEdition(list);
        setupGoogleEdition(list);
        return list;
    }

    public List<AbstractBugdroid> getBugdroids() {
        return this.mBugdroids;
    }

    public List<AbstractBugdroid> findBugdroidByTag(String tag) {
        ArrayList<AbstractBugdroid> resultSet = new ArrayList<AbstractBugdroid>();
        for(AbstractBugdroid bugdroid:this.mBugdroids) {
            if(bugdroid.getTag().compareTo(tag) == 0) {
                resultSet.add(bugdroid);
            }
        }
        return resultSet;
    }

    public AbstractBugdroid findBugdroidByID(int id) {
        AbstractBugdroid result = null;
        for(AbstractBugdroid bugdroid:this.mBugdroids) {
            if(bugdroid.getID() == id) {
                result = bugdroid;
                break;
            }
        }

        return result;
    }


    private void setupGoogleEdition(ArrayList<AbstractBugdroid> list) {

        list.add(new GoogleBugdroid(77,"Analytics I",GOOGLE_EDITION_TAG,GOOGLE_INC,mRes.getString(R.string.analytics_one_descripton),new GregorianCalendar(2011,9,1),0,R.drawable.ge_analy_simple,R.drawable.ge_analy_large));
        list.add(new GoogleBugdroid(78,"Analytics II",GOOGLE_EDITION_TAG,GOOGLE_INC,mRes.getString(R.string.analytics_two_description),new GregorianCalendar(2012,10,1),0,R.drawable.ge_analy_two_simple,R.drawable.ge_analy_two_large));
        list.add(new GoogleBugdroid(79,"ITA Aviator",GOOGLE_EDITION_TAG,GOOGLE_INC,null,new GregorianCalendar(2012,11,1),0,R.drawable.ge_aviator_simple,R.drawable.ge_aviator_large));
        list.add(new GoogleBugdroid(80,"Developer",GOOGLE_EDITION_TAG,GOOGLE_INC,mRes.getString(R.string.developer_description),new GregorianCalendar(2010,2,1),0,R.drawable.ge_dev_simple,R.drawable.ge_dev_large));
        list.add(new GoogleBugdroid(81,"Schemer",GOOGLE_EDITION_TAG,GOOGLE_INC,mRes.getString(R.string.schemer_description),new GregorianCalendar(2012,3,1),0,R.drawable.ge_schemer_simple,R.drawable.ge_schemer_large));
        list.add(new GoogleBugdroid(82,"UX Researcher",GOOGLE_EDITION_TAG,GOOGLE_INC,mRes.getString(R.string.ux_researcher_description),new GregorianCalendar(2012,8,1),0,R.drawable.ge_uxresearcher_simple,R.drawable.ge_uxresearcher_large));
        list.add(new GoogleBugdroid(83,"I/O Tester",GOOGLE_EDITION_TAG,ANDREW_BELL,mRes.getString(R.string.io_tester),new GregorianCalendar(2013,6,1),0,R.drawable.se_io_tester_simple,R.drawable.se_io_tester_large));
        list.add(new GoogleBugdroid(84,"Mobley",GOOGLE_EDITION_TAG,GOOGLE_INC,mRes.getString(R.string.mobley_description),new GregorianCalendar(2012,2,1),0,R.drawable.ge_mobley_simple,R.drawable.ge_mobley_large));
        list.add(new GoogleBugdroid(85,"GTech",GOOGLE_EDITION_TAG,ANDREW_BELL,null,new GregorianCalendar(2013,4,1),0,R.drawable.ge_gtech_simple,R.drawable.ge_gtech_large));
        list.add(new GoogleBugdroid(86,"Google Student Ambassador",GOOGLE_EDITION_TAG,GOOGLE_INC,null,new GregorianCalendar(2013,6,1),0,R.drawable.ge_student_simple,R.drawable.ge_student_large));
        list.add(new GoogleBugdroid(87,"ADX-RTB",GOOGLE_EDITION_TAG,GOOGLE_INC,null,new GregorianCalendar(2013,10,1),0,R.drawable.ge_adx_simple,R.drawable.ge_adx_large));
        list.add(new GoogleBugdroid(88,"AdMob Racer",GOOGLE_EDITION_TAG,GOOGLE_INC,null,new GregorianCalendar(2013,11,1),0,R.drawable.ge_admob_simple,R.drawable.ge_admob_large));
        list.add(new GoogleBugdroid(89,"Google Executive Set",GOOGLE_EDITION_TAG,GOOGLE_INC,mRes.getString(R.string.analytics_one_descripton),new GregorianCalendar(2011,9,1),0,R.drawable.ge_analy_simple,R.drawable.ge_analy_large));
        //TODO NUMERO 90 POUR ANALYTICS V3
        list.add(new GoogleBugdroid(91,"Noogler SE",GOOGLE_EDITION_TAG,JEFF_YAKSICK,mRes.getString(R.string.noogler_special_description),new GregorianCalendar(2011,1,1),0,R.drawable.s02_noogler_simple,R.drawable.s02_noogler_large));
        list.add(new GoogleBugdroid(92,"Bear SE",GOOGLE_EDITION_TAG,ANDREW_BELL,mRes.getString(R.string.special_bb_description),new GregorianCalendar(2013,3,1),0,R.drawable.bb_bear_simple,R.drawable.bb_bear_large));
        list.add(new GoogleBugdroid(93,"Pinkey SE",GOOGLE_EDITION_TAG,ANDREW_BELL,mRes.getString(R.string.special_bb_description),new GregorianCalendar(2013,3,1),0,R.drawable.bb_pinkey_simple,R.drawable.bb_pinkey_large));
        list.add(new GoogleBugdroid(94,"MWC Blue",GOOGLE_EDITION_TAG,ANDREW_BELL,mRes.getString(R.string.mwc_description),new GregorianCalendar(2012,2,1),0,R.drawable.se_mwc_blue_simple,R.drawable.se_mwc_blue_large));
        list.add(new GoogleBugdroid(95,"MWC Red",GOOGLE_EDITION_TAG,ANDREW_BELL,mRes.getString(R.string.mwc_description),new GregorianCalendar(2012,2,1),0,R.drawable.se_mwc_red_simple,R.drawable.se_mwc_red_large));
        list.add(new GoogleBugdroid(96,"MWC Yellow",GOOGLE_EDITION_TAG,ANDREW_BELL,mRes.getString(R.string.mwc_description),new GregorianCalendar(2012,2,1),0,R.drawable.se_mwc_yellow_simple,R.drawable.se_mwc_yellow_large));
        list.add(new GoogleBugdroid(97,"MWC Green",GOOGLE_EDITION_TAG,ANDREW_BELL,mRes.getString(R.string.mwc_description),new GregorianCalendar(2012,2,1),0,R.drawable.se_mwc_green_simple,R.drawable.se_mwc_green_large));
        list.add(new GoogleBugdroid(98,"MWC Purple",GOOGLE_EDITION_TAG,ANDREW_BELL,mRes.getString(R.string.mwc_description),new GregorianCalendar(2012,2,1),0,R.drawable.se_mwc_purple_simple,R.drawable.se_mwc_purple_large));
    }

    private void setupSpecialEdition(ArrayList<AbstractBugdroid> list) {
        list.add(new SpecialEditionBugdroid(99,"Tourist",SPECIAL_EDITION_TAG,ANDREW_BELL,mRes.getString(R.string.bbq_blue_description),new GregorianCalendar(2012,10,1),0,R.drawable.se_tourist_simple,R.drawable.se_tourist_large));
        list.add(new SpecialEditionBugdroid(100,"Griller Master",SPECIAL_EDITION_TAG,ANDREW_BELL,mRes.getString(R.string.bbq_blue_description),new GregorianCalendar(2012,10,1),0,R.drawable.se_griller_master_simple,R.drawable.se_griller_master_large));
        list.add(new SpecialEditionBugdroid(101,"Fandroid",SPECIAL_EDITION_TAG,ANDREW_BELL,mRes.getString(R.string.bbq_red_description),new GregorianCalendar(2012,10,1),0,R.drawable.se_fandroid_simple,R.drawable.se_fandroid_large));
        list.add(new SpecialEditionBugdroid(102,"Griller",SPECIAL_EDITION_TAG,ANDREW_BELL,mRes.getString(R.string.bbq_red_description),new GregorianCalendar(2012,10,1),0,R.drawable.se_griller_simple,R.drawable.se_griller_large));
    }

    private void setupBigBoxEdition(ArrayList<AbstractBugdroid> list) {

        GregorianCalendar dateBB = new GregorianCalendar(2010,2,1);

        list.add(new SpecialEditionBugdroid(56,"Standard Green",BIG_BOX_EDITION_TAG,ANDREW_BELL,null,dateBB,0,R.drawable.bb_green_simple,R.drawable.s01_standardgreen_large));
        list.add(new SpecialEditionBugdroid(57,"Ruby",BIG_BOX_EDITION_TAG,ANDREW_BELL,null,dateBB,0,R.drawable.bb_ruby_simple,R.drawable.bb_ruby_large));
        list.add(new SpecialEditionBugdroid(58,"Pinkey",BIG_BOX_EDITION_TAG,ANDREW_BELL,null,dateBB,0,R.drawable.bb_pinkey_simple,R.drawable.bb_pinkey_large));
        list.add(new SpecialEditionBugdroid(59,"Businessman",BIG_BOX_EDITION_TAG,ANDREW_BELL,null,dateBB,0,R.drawable.bb_businessman_simple,R.drawable.bb_businessman_large));
        list.add(new SpecialEditionBugdroid(60,"Taxi",BIG_BOX_EDITION_TAG,ANDREW_BELL,null,dateBB,0,R.drawable.bb_taxi_simple,R.drawable.bb_taxi_large));
        list.add(new SpecialEditionBugdroid(61,"Yeti",BIG_BOX_EDITION_TAG,ANDREW_BELL,null,dateBB,0,R.drawable.bb_yeti_simple,R.drawable.bb_yeti_large));
        list.add(new SpecialEditionBugdroid(62,"Bear",BIG_BOX_EDITION_TAG,ANDREW_BELL,null,dateBB,0,R.drawable.bb_bear_simple,R.drawable.bb_bear_large));
        list.add(new SpecialEditionBugdroid(63,"Doctor",BIG_BOX_EDITION_TAG,ANDREW_BELL,null,dateBB,0,R.drawable.ge_doctor_simple,R.drawable.ge_doctor_large));
        list.add(new SpecialEditionBugdroid(64,"Tennisman",BIG_BOX_EDITION_TAG,ANDREW_BELL,null,dateBB,0,R.drawable.se_tennisman_simple,R.drawable.se_tennisman_large));

    }

    private void setupLuckyCats(ArrayList<AbstractBugdroid> list) {

        GregorianCalendar dateLC = new GregorianCalendar(2013,3,1);

        list.add(new SpecialEditionBugdroid(65,"Gold Lucky Cat Open Eyes",LUCKY_CATS_TAG,SHANE_JESSUP,mRes.getString(R.string.gold_lc_open_eye_description),dateLC,0,R.drawable.lc_gold_coin_simple,R.drawable.lc_gold_coin_large));
        list.add(new SpecialEditionBugdroid(66,"White Lucky Cat Open Eyes",LUCKY_CATS_TAG,SHANE_JESSUP,mRes.getString(R.string.white_lc_open_eye_description),dateLC,0,R.drawable.lc_white_coin_simple,R.drawable.lc_white_coin_large));
        list.add(new SpecialEditionBugdroid(67,"Black Lucky Cat Open Eyes",LUCKY_CATS_TAG,SHANE_JESSUP,mRes.getString(R.string.black_lc_open_eye_description),dateLC,0,R.drawable.lc_black_coin_simple,R.drawable.lc_black_coin_large));
        list.add(new SpecialEditionBugdroid(68,"Green Lucky Cat",LUCKY_CATS_TAG,SHANE_JESSUP,mRes.getString(R.string.green_lc_description),dateLC,0,R.drawable.lc_green_simple,R.drawable.lc_green_large));
        list.add(new SpecialEditionBugdroid(69,"Yellow Lucky Cat",LUCKY_CATS_TAG,SHANE_JESSUP,mRes.getString(R.string.yellow_lc_description),dateLC,0,R.drawable.lc_yellow_simple,R.drawable.lc_yellow_large));
        list.add(new SpecialEditionBugdroid(70,"Purple Lucky Cat",LUCKY_CATS_TAG,SHANE_JESSUP,mRes.getString(R.string.purple_lc_description),dateLC,0,R.drawable.lc_purple_simple,R.drawable.lc_purple_large));
        list.add(new SpecialEditionBugdroid(71,"Blue Lucky Cat",LUCKY_CATS_TAG,SHANE_JESSUP,mRes.getString(R.string.blue_lc_description),dateLC,0,R.drawable.lc_blue_simple,R.drawable.lc_blue_large));
        list.add(new SpecialEditionBugdroid(72,"Pink Lucky Cat",LUCKY_CATS_TAG,SHANE_JESSUP,mRes.getString(R.string.pink_lc_description),dateLC,0,R.drawable.lc_pink_simple,R.drawable.lc_pink_large));
        list.add(new SpecialEditionBugdroid(73,"Red Lucky Cat",LUCKY_CATS_TAG,SHANE_JESSUP,mRes.getString(R.string.red_lc_description),dateLC,0,R.drawable.lc_red_simple,R.drawable.lc_red_large));
        list.add(new SpecialEditionBugdroid(74,"Black Lucky Cat",LUCKY_CATS_TAG,SHANE_JESSUP,mRes.getString(R.string.black_lc_description),dateLC,0,R.drawable.lc_black_simple,R.drawable.lc_black_large));
        list.add(new SpecialEditionBugdroid(75,"Gold Lucky Cat",LUCKY_CATS_TAG,SHANE_JESSUP,mRes.getString(R.string.gold_lc_description),dateLC,0,R.drawable.lc_gold_simple,R.drawable.lc_gold_large));
        list.add(new SpecialEditionBugdroid(76,"White Lucky Cat",LUCKY_CATS_TAG,SHANE_JESSUP,mRes.getString(R.string.white_lc_description),dateLC,0,R.drawable.lc_white_simple,R.drawable.lc_white_large));

    }

    private void setupSeriesBugdroids(ArrayList<AbstractBugdroid> list) {

        GregorianCalendar dateS1 = new GregorianCalendar(2010,2,1);
        GregorianCalendar dateS2 = new GregorianCalendar(2011,3,1);
        GregorianCalendar dateS3 = new GregorianCalendar(2012,8,1);
        GregorianCalendar dateS4 = new GregorianCalendar(2013,11,1);


        //SERIES ONE
        list.add(new SeriesBugdroid(1,"Standard Green",SERIES_ONE_TAG, GOOGLE_INC,mRes.getString(R.string.standard_green_description),dateS1,0,R.drawable.s01_standardgreen_simple,R.drawable.s01_standardgreen_large,"3/16"));
        list.add(new SeriesBugdroid(2,"Albino",SERIES_ONE_TAG, ANDREW_BELL,null,dateS1,0,R.drawable.s01_albino_simple,R.drawable.s01_albino_large,"1/16"));
        list.add(new SeriesBugdroid(3,"Copperbot",SERIES_ONE_TAG, ANDREW_BELL,null,dateS1,0,R.drawable.s01_copperbot_simple,R.drawable.s01_copperbot_large,"2/16"));
        list.add(new SeriesBugdroid(4,"Creature",SERIES_ONE_TAG, ANDREW_BELL,null,dateS1,0,R.drawable.s01_creature_simple,R.drawable.s01_creature_large,"2/16"));
        list.add(new SeriesBugdroid(5,"Darknet",SERIES_ONE_TAG, ANDREW_BELL,null,dateS1,0,R.drawable.s01_darknet_simple,R.drawable.s01_darknet_large,"2/16"));
        list.add(new SeriesBugdroid(6,"Hi-Voltage",SERIES_ONE_TAG, ANDREW_BELL,null,dateS1,0,R.drawable.s01_hi_voltage_simple,R.drawable.s01_hi_voltage_large,"2/16"));
        list.add(new SeriesBugdroid(7,"Octopoid",SERIES_ONE_TAG, ANDREW_BELL,null,dateS1,0,R.drawable.s01_octopoid_simple,R.drawable.s01_octopoid_large,"1/16"));
        list.add(new SeriesBugdroid(8,"Reactor",SERIES_ONE_TAG, ANDREW_BELL,mRes.getString(R.string.reactor_description),dateS1,0,R.drawable.s01_reactor_simple,R.drawable.s01_reactor_large,"1/16"));
        list.add(new SeriesBugdroid(9,"Worker",SERIES_ONE_TAG, ANDREW_BELL,null,dateS1,0,R.drawable.s01_worker_simple,R.drawable.s01_worker_large,"1/16"));
        list.add(new ChaserBugdroid(10,"APK 2008",SERIES_ONE_TAG, ANDREW_BELL,mRes.getString(R.string.apk_description),dateS1,0,R.drawable.s01_apk_simple,R.drawable.s01_apk_large));
        list.add(new ChaserBugdroid(11,"Invader",SERIES_ONE_TAG, ANDREW_BELL,null,dateS1,0,R.drawable.s01_invader_simple,R.drawable.s01_invader_large));
        list.add(new ChaserBugdroid(12,"Copper Wash",SERIES_ONE_TAG, ANDREW_BELL,mRes.getString(R.string.copper_wash_description),dateS1,0,R.drawable.s01_rusty_simple,R.drawable.s01_rusty_large));

        //SERIES TWO
        list.add(new SeriesBugdroid(13,"Bernard",SERIES_TWO_TAG, SCOTT_TOLLESON,null,dateS2,0,R.drawable.s02_bernard_simple,R.drawable.s02_bernard_large,"1/16"));
        list.add(new SeriesBugdroid(14,"Blackbeard",SERIES_TWO_TAG, ANDREW_BELL,null,dateS2,0,R.drawable.s02_blackbear_simple,R.drawable.s02_blackbear_large,"1/16"));
        list.add(new SeriesBugdroid(15,"Bluebot",SERIES_TWO_TAG, GOOGLE_INC,null,dateS2,0,R.drawable.s02_bluebot_simple,R.drawable.s02_bluebot_large,"1/16"));
        list.add(new SeriesBugdroid(16,"Vanilla Cupcake",SERIES_TWO_TAG, GARY_HAM,mRes.getString(R.string.vanilla_cupcake_description),dateS2,0,R.drawable.s02_cupcake_simple,R.drawable.s02_cupcake_large,"1/16"));
        list.add(new SeriesBugdroid(17,"GD-927",SERIES_TWO_TAG, ANDREW_BELL,null,dateS2,0,R.drawable.s02_gd_simple,R.drawable.s02_gd_large,"1/16"));
        list.add(new SeriesBugdroid(18,"Greeneon",SERIES_TWO_TAG, GOOGLE_INC,null,dateS2,0,R.drawable.s02_greeneon_simple,R.drawable.s02_greeneon_large,"2/16"));
        list.add(new SeriesBugdroid(19,"Hexcode",SERIES_TWO_TAG, ANDREW_BELL,null,dateS2,0,R.drawable.s02_hexcode_simple,R.drawable.s02_hexcode_large,"2/16"));
        list.add(new SeriesBugdroid(20,"Iceberg",SERIES_TWO_TAG, ANDREW_BELL,null,dateS2,0,R.drawable.s02_iceberg_simple,R.drawable.s02_iceberg_large,"2/16"));
        list.add(new SeriesBugdroid(21,"Noogler",SERIES_TWO_TAG, JEFF_YAKSICK,null,dateS2,0,R.drawable.s02_noogler_simple,R.drawable.s02_noogler_large,"1/16"));
        list.add(new SeriesBugdroid(22,"Racer",SERIES_TWO_TAG, JEFF_YAKSICK,null,dateS2,0,R.drawable.s02_racer_simple,R.drawable.s02_racer_large,"1/16"));
        list.add(new SeriesBugdroid(23,"Rupture",SERIES_TWO_TAG, DOKTOR_A,null,dateS2,0,R.drawable.s02_rupture_simple,R.drawable.s02_rupture_large,"1/16"));
        list.add(new ChaserBugdroid(24,"Chocolate Cupcake",SERIES_TWO_TAG, GARY_HAM,mRes.getString(R.string.chocolate_cupcake_description),dateS2,0,R.drawable.s02_chocolate_cupcake_simple,R.drawable.s02_chocolate_cupcake_large));
        list.add(new ChaserBugdroid(25,"Cyanogen",SERIES_TWO_TAG, ANDREW_BELL,null,dateS2,0,R.drawable.s02_cyanogen_simple,R.drawable.s02_cyanogen_large));
        list.add(new ChaserBugdroid(26,"Mecha",SERIES_TWO_TAG, JEFF_YAKSICK,null,dateS2,0,R.drawable.s02_mecha_simple,R.drawable.s02_mecha_large));

        //SERIES THREE
        list.add(new SeriesBugdroid(27,"8 Ball",SERIES_THREE_TAG, SKET_ONE,null,dateS3,0,R.drawable.s03_ball_simple,R.drawable.s03_ball_large,"1/16"));
        list.add(new SeriesBugdroid(28,"Barista Bot",SERIES_THREE_TAG, ANDREW_BELL,null,dateS3,0,R.drawable.s03_baristabot_simple,R.drawable.s03_baristabot_large,"1/16"));
        list.add(new SeriesBugdroid(29,"Clear",SERIES_THREE_TAG, GOOGLE_INC,mRes.getString(R.string.clear_description),dateS3,0,R.drawable.s03_clear_simple,R.drawable.s03_clear_large,"1/16"));
        list.add(new SeriesBugdroid(30,"Cry-On",SERIES_THREE_TAG, MAD,mRes.getString(R.string.cry_on_description),dateS3,0,R.drawable.s03_cry_on_simple,R.drawable.s03_cry_on_large,"1/16"));
        list.add(new SeriesBugdroid(31,"Escape Ape",SERIES_THREE_TAG, KRONK,null,dateS3,0,R.drawable.s03_escape_ape_simple,R.drawable.s03_escape_ape_large,"1/16"));
        list.add(new SeriesBugdroid(32,"Intergalactic",SERIES_THREE_TAG, KANO,null,dateS3,0,R.drawable.s03_intergalactic_simple,R.drawable.s03_intergalactic_large,"1/16"));
        list.add(new SeriesBugdroid(33,"Nexus",SERIES_THREE_TAG, GOOGLE_INC,null,dateS3,0,R.drawable.s03_nexus_simple,R.drawable.s03_nexus_large,"2/16"));
        list.add(new SeriesBugdroid(34,"Pandroid",SERIES_THREE_TAG, KELLY_DENATO,null,dateS3,0,R.drawable.s03_pandroid_simple,R.drawable.s03_pandroid_large,"1/16"));
        list.add(new SeriesBugdroid(35,"Professor Skully McRivethead",SERIES_THREE_TAG, HUCK_GEE,null,dateS3,0,R.drawable.s03_professor_simple,R.drawable.s03_professor_large,"1/16"));
        list.add(new SeriesBugdroid(36,"Red",SERIES_THREE_TAG, GOOGLE_INC,null,dateS3,0,R.drawable.s03_red_simple,R.drawable.s03_red_large,"2/16"));
        list.add(new SeriesBugdroid(37,"Sir Knightly Bild",SERIES_THREE_TAG, ANDREW_BELL,null,dateS3,0,R.drawable.s03_sir_knightly_simple,R.drawable.s03_sir_knightly_large,"1/16"));
        list.add(new SeriesBugdroid(38,"Whoogle the Owl",SERIES_THREE_TAG, GARY_HAM,null,dateS3,0,R.drawable.s03_whoogle_simple,R.drawable.s03_whoogle_large,"3/16"));
        list.add(new ChaserBugdroid(39,"Agent Argh",SERIES_THREE_TAG, SCOTT_TOLLESON,null,dateS3,0,R.drawable.s03_agent_argh_simple,R.drawable.s03_agent_argh_large));
        list.add(new ChaserBugdroid(40,"Agent Rawr",SERIES_THREE_TAG, SCOTT_TOLLESON,null,dateS3,0,R.drawable.s03_agent_rawr_simple,R.drawable.s03_agent_rawr_large));
        list.add(new ChaserBugdroid(41,"Inner Workings",SERIES_THREE_TAG, KRONK,null,dateS3,0,R.drawable.s03_inner_workings_simple,R.drawable.s03_inner_workings_large));

        //SERIES FOUR
        list.add(new SeriesBugdroid(41,"Astronomiton",SERIES_FOUR_TAG, SKET_ONE,null,dateS4,0,R.drawable.s04_astromiton_simple,R.drawable.s04_astro_large,"2/16"));
        list.add(new SeriesBugdroid(42,"Fisherman",SERIES_FOUR_TAG, KONG_ANDRI,null,dateS4,0,R.drawable.s04_fisherman_simple,R.drawable.s04_fisherman_large,"1/16"));
        list.add(new SeriesBugdroid(43,"Yellow",SERIES_FOUR_TAG, GOOGLE_INC,null,dateS4,0,R.drawable.s04_yellow_simple,R.drawable.s04_yellow_large,"2/16"));
        list.add(new SeriesBugdroid(44,"2x2",SERIES_FOUR_TAG, SCOTT_TOLLESON,null,dateS4,0,R.drawable.s04_twobytwo_simple,R.drawable.s04_twobytwo_large,"1/16"));
        list.add(new SeriesBugdroid(45,"Flipmode",SERIES_FOUR_TAG, KANO,null,dateS4,0,R.drawable.s04_flipmode_simple,R.drawable.s04_flipmode_large,"1/16"));
        list.add(new SeriesBugdroid(46,"Stress Tech",SERIES_FOUR_TAG, SERGIO_MANCINI,null,dateS4,0,R.drawable.s04_stresstech_simple,R.drawable.s04_stresstech_large,"1/16"));
        list.add(new SeriesBugdroid(47,"Diktator",SERIES_FOUR_TAG, KRONK,null,dateS4,0,R.drawable.s04_dicktator_simple,R.drawable.s04_dicktator_large,"1/16"));
        list.add(new SeriesBugdroid(48,"Gold",SERIES_FOUR_TAG, GOOGLE_INC,null,dateS4,0,R.drawable.s04_gold_simple,R.drawable.s04_gold_large,"2/16"));
        list.add(new SeriesBugdroid(49,"Core Dump",SERIES_FOUR_TAG, ANDREW_BELL,null,dateS4,0,R.drawable.s04_dump_simple,R.drawable.s04_coredump_large,"1/16"));
        list.add(new SeriesBugdroid(50,"Track Star",SERIES_FOUR_TAG, GOOGLE_INC,null,dateS4,0,R.drawable.s04_star_simple,R.drawable.s04_star_large,"1/16"));
        list.add(new SeriesBugdroid(51,"Caveman",SERIES_FOUR_TAG, KONG_ANDRI,null,dateS4,0,R.drawable.s04_caveman_simple,R.drawable.s04_caveman_large,"1/16"));
        list.add(new SeriesBugdroid(52,"Wee Ninja",SERIES_FOUR_TAG, SHAWNIMALS,null,dateS4,0,R.drawable.s04_ninja_simple,R.drawable.s04_ninja_large,"1/16"));
        list.add(new ChaserBugdroid(53,"Chrome Green",SERIES_FOUR_TAG, GOOGLE_INC,null,dateS4,0,R.drawable.s04_chromegreen_simple,R.drawable.s04_chromegreen_large));
        list.add(new ChaserBugdroid(54,"Samurai",SERIES_FOUR_TAG, FAKIR,null,dateS4,0,R.drawable.s04_samurai_simple,R.drawable.s04_samurai_large));
        list.add(new ChaserBugdroid(55,"Flipmode Green",SERIES_FOUR_TAG, KANO,null,dateS4,0,R.drawable.s04_flipmodegr_simple,R.drawable.s04_flipmodefr_large));
    }

}
