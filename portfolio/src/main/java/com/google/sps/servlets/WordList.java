package com.google.sps.servlets;

import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import java.util.*;
import java.io.FileReader;

@WebServlet("/word")
public class WordList extends HttpServlet {
   @Override
 // private final ArrayListA<String> wordlist;

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
     final ArrayList<String> wordlist = new ArrayList<String>();
     
    wordlist.add("teach");
     wordlist.add("tear");
     wordlist.add("tease");
     wordlist.add("teal");
     wordlist.add("team");
     wordlist.add("teak");
     wordlist.add("kick");
     wordlist.add("lick");
     wordlist.add("sick");
     wordlist.add("pick");
     wordlist.add("wick");
     wordlist.add("tick");
     wordlist.add("book");
     wordlist.add("took");
     wordlist.add("shook");
     wordlist.add("cook");
     wordlist.add("hook");
     wordlist.add("look");
     wordlist.add("meat");
     wordlist.add("feet");
     wordlist.add("heat");
     wordlist.add("seat");
     wordlist.add("cheat");
     wordlist.add("neat");
     wordlist.add("pin");
     wordlist.add("sin");
     wordlist.add("tin");
     wordlist.add("win");
     wordlist.add("din");
     wordlist.add("tin");
     wordlist.add("nest");
     wordlist.add("vest");
     wordlist.add("west");
     wordlist.add("zest");
     wordlist.add("best");
     wordlist.add("rest");
     wordlist.add("bust");
     wordlist.add("just");
     wordlist.add("rust");
     wordlist.add("must");
     wordlist.add("gust");
     wordlist.add("dust");
     wordlist.add("raw");
     wordlist.add("paw");
     wordlist.add("law");
     wordlist.add("jaw");
     wordlist.add("thaw");
     wordlist.add("saw");
     wordlist.add("way");
     wordlist.add("may");
     wordlist.add("say");
     wordlist.add("gay");
     wordlist.add("day");
     wordlist.add("pay");
     wordlist.add("sun");
     wordlist.add("nun");
     wordlist.add("gun");
     wordlist.add("fun");
     wordlist.add("bun");
     wordlist.add("run");
     wordlist.add("rang");
     wordlist.add("fang");
     wordlist.add("gang");
     wordlist.add("bang");
     wordlist.add("sang");
     wordlist.add("hang");
     wordlist.add("pun");
     wordlist.add("puff");
     wordlist.add("pup");
     wordlist.add("pug");
     wordlist.add("putt");
     wordlist.add("pub");
     wordlist.add("sing");
     wordlist.add("sit");
     wordlist.add("sin");
     wordlist.add("sip");
     wordlist.add("sick");
     wordlist.add("sill");
     wordlist.add("kit");
     wordlist.add("bit");
     wordlist.add("fit");
     wordlist.add("sit");
     wordlist.add("wit");
     wordlist.add("hit");
     wordlist.add("came");
     wordlist.add("cape");
     wordlist.add("cane");
     wordlist.add("cake");
     wordlist.add("cave");
     wordlist.add("case");
     wordlist.add("cut");
     wordlist.add("cub");
     wordlist.add("cuff");
     wordlist.add("cud");
     wordlist.add("cup");
     wordlist.add("cuss");
     wordlist.add("hark");
     wordlist.add("dark");
     wordlist.add("mark");
     wordlist.add("lark");
     wordlist.add("park");
     wordlist.add("bark");
     wordlist.add("bat");
     wordlist.add("bad");
     wordlist.add("badge");
     wordlist.add("bass");
     wordlist.add("ban");
     wordlist.add("bath");
     wordlist.add("foil");
     wordlist.add("coil");
     wordlist.add("boil");
     wordlist.add("oil");
     wordlist.add("toil");
     wordlist.add("soil");
     wordlist.add("pass");
     wordlist.add("pat");
     wordlist.add("pang");
     wordlist.add("pad");
     wordlist.add("path");
     wordlist.add("patch");
     wordlist.add("peace");
     wordlist.add("peas");
     wordlist.add("peak");
     wordlist.add("peal");
     wordlist.add("peat");
     wordlist.add("peach");
     wordlist.add("pill");
     wordlist.add("pick");
     wordlist.add("pitch");
     wordlist.add("pig");
     wordlist.add("pin");
     wordlist.add("pit");
     wordlist.add("rave");
     wordlist.add("rake");
     wordlist.add("rage");
     wordlist.add("rate");
     wordlist.add("raze");
     wordlist.add("ray");
     wordlist.add("gale");
     wordlist.add("male");
     wordlist.add("vale");
     wordlist.add("bale");
     wordlist.add("sale");
     wordlist.add("pale");
     wordlist.add("peel");
     wordlist.add("reel");
     wordlist.add("feel");
     wordlist.add("heel");
     wordlist.add("keel");
     wordlist.add("eel");
     wordlist.add("duck");
     wordlist.add("dud");
     wordlist.add("dull");
     wordlist.add("dub");
     wordlist.add("dug");
     wordlist.add("dun");
     wordlist.add("fill");
     wordlist.add("fig");
     wordlist.add("fin");
     wordlist.add("fizz");
     wordlist.add("fig");
     wordlist.add("fish");
     wordlist.add("dent");
     wordlist.add("bent");
     wordlist.add("went");
     wordlist.add("tent");
     wordlist.add("rent");
     wordlist.add("vent");
     wordlist.add("zip");
     wordlist.add("rip");
     wordlist.add("tip");
     wordlist.add("dip");
     wordlist.add("hib");
     wordlist.add("lip");
     wordlist.add("hop");
     wordlist.add("pop");
     wordlist.add("cop");
     wordlist.add("mop");
     wordlist.add("shop");
     wordlist.add("will");
     wordlist.add("hill");
     wordlist.add("kill");
     wordlist.add("chill");
     wordlist.add("fill");
     wordlist.add("bill");
     wordlist.add("sake");
     wordlist.add("sale");
     wordlist.add("save");
     wordlist.add("sane");
     wordlist.add("safe");
     wordlist.add("same");
     wordlist.add("dig");
      wordlist.add("dip");
     wordlist.add("did");
     wordlist.add("dim");
     wordlist.add("dill");
     wordlist.add("din");
     wordlist.add("led");
     wordlist.add("shed");
     wordlist.add("red");
     wordlist.add("bed");
     wordlist.add("fed");
     wordlist.add("wed");
     wordlist.add("sold");
     wordlist.add("told");
     wordlist.add("hold");
     wordlist.add("fold");
     wordlist.add("gold");
     wordlist.add("cold");
     wordlist.add("late");
     wordlist.add("lake");
     wordlist.add("lay");
     wordlist.add("lace");
     wordlist.add("lane");
     wordlist.add("lame");
     wordlist.add("bean");
     wordlist.add("beach");
     wordlist.add("beat");
     wordlist.add("beam");
     wordlist.add("bead");
     wordlist.add("beak");
     wordlist.add("fame");
     wordlist.add("same");
     wordlist.add("came");
     wordlist.add("name");
     wordlist.add("tame");
     wordlist.add("game");
     wordlist.add("bun");
     wordlist.add("bus");
     wordlist.add("but");
     wordlist.add("buff");
     wordlist.add("budg");
     wordlist.add("bug");
     wordlist.add("ten");
     wordlist.add("pen");
     wordlist.add("men");
     wordlist.add("den");
     wordlist.add("hen");
     wordlist.add("then");
     wordlist.add("sud");
     wordlist.add("sum");
     wordlist.add("sub");
     wordlist.add("sun");
     wordlist.add("sup");
     wordlist.add("sung");
     wordlist.add("hot");
     wordlist.add("got");
     wordlist.add("not");
     wordlist.add("pot");
     wordlist.add("lot");
     wordlist.add("tot");
     wordlist.add("page");
     wordlist.add("pane");
     wordlist.add("pace");
     wordlist.add("pay");
     wordlist.add("pale");
     wordlist.add("pave");
     wordlist.add("tab");
     wordlist.add("tan");
     wordlist.add("tam");
     wordlist.add("tang");
     wordlist.add("tack");
     wordlist.add("tap");
     wordlist.add("hear");
     wordlist.add("health");
     wordlist.add("heal");
     wordlist.add("heave");
     wordlist.add("heat");
     wordlist.add("heap");
     wordlist.add("kith");
     wordlist.add("king");
     wordlist.add("kid");
     wordlist.add("kid");
     wordlist.add("kiss");
     wordlist.add("kill");
     wordlist.add("sad");
     wordlist.add("sass");
     wordlist.add("sag");
     wordlist.add("sack");
     wordlist.add("sap");
     wordlist.add("sat");
     wordlist.add("seep");
     wordlist.add("seen");
     wordlist.add("seethe");
     wordlist.add("seed");
     wordlist.add("seem");
     wordlist.add("seek");
     wordlist.add("jig");
     wordlist.add("wig");
     wordlist.add("pig");
     wordlist.add("big");
     wordlist.add("rig");
     wordlist.add("fig");
     // make order random 
    Collections.shuffle(wordlist); 
     String json = new Gson().toJson(wordlist);

   //  return json;
     response.setContentType("application/json;");
     response.getWriter().println(json);
     // work on parsing words to html
  }
  // Implement a function to add new words easily instead of manually adding them in the future
 // public static ArrayList<String> text_to_list(String file){
    //ArrayList<String> sitewords = new ArrayList<>();
    // File fileread = new File(file);
    // Scanner newfile = new Scanner(fileread);
    // String line;

    // while (newfile.hasNextLine()){
    //   line = newfile.nextLine();
    //   String [] array = line.split(" "); // 
    //   for (String word: array){
    //       sitewords.add(word);
    //   }
    // } catch(IOException e){
    //         e.printStackTrace();
    //     }
    // return sitewords;
    // }
  }