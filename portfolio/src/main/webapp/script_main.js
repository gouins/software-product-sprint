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


/* function addRandomGreeting() {
  const greetings =
      ['Natural acting','Dark light','Loud silence','Weirdly normal','Soft thunder', 'Fresh mold', 'Tepid snow', 'Escaped prisoner', 'Deliberate ignorance', 'Mature baby', 'Bittersweet'];

  // Pick a random greeting.
  const greeting = greetings[Math.floor(Math.random() * greetings.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
}
*/
// fetch JSON string
function getGreeting() {
  fetch('/data').then(response => response.json()).then((greeting) => {
    // samir is an array, not a string, so we have to
    // reference its fields to create HTML content
    const greetingList = document.getElementById('greeting-container');
    greetingList.innerHTML = '';
    // issue with append statements 
    greetingList.appendChild(
        document.createElement(greeting.eng));
    greetingList.appendChild(
        document.createElement(greeting.fre));
    greetingList.appendChild(
        document.createElement(greeting.spa));
  });
}
