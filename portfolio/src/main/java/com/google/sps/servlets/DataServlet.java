// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.servlets;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

/** Servlet that returns some example content. TODO: modify this file to handle comments data */
@WebServlet("/text")
public class DataServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    // make greeting object
  //  Greeting greeting = new Greeting("hi","salut","holla");
    //convert to Json
    //String json = convertToJsonUsingGson(greeting);
        ArrayList<String> names = new ArrayList<String>();
    response.setContentType("name/html;");
    response.getWriter().println("hi");
  }

  private String convertToJsonUsingGson(Greeting greeting) {
    Gson gson = new Gson();
    String json = gson.toJson(greeting);
    return json;
  }
  class Greeting {

// attributes
  private final String eng;
  private final String fre;
  private final String spa;

//constructor
  public Greeting(String eng, String fre, String spa) {
      this.eng = eng;
      this.fre = fre;
      this.spa = spa;
  }

  public String getEng() {
    return eng;
  }

  public String getFre() {
    return fre;
  }

  public String getSpa() {
    return spa;
  }
  }
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    // Get the input from the form.
    String text = getParameter(request, "text-input", "");
    Entity taskEntity = new Entity("Task");
    taskEntity.setProperty("comment", text);  
    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
    datastore.put(taskEntity);
    response.sendRedirect("/index.html");
   // response.setContentType("text/html;");
  }

  private String getParameter(HttpServletRequest request, String name, String defaultValue) {
    String value = request.getParameter(name);
    if (value == null) {
      return defaultValue;
    }
    return value;
  }
}