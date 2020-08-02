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

/**
 * Adds a slideshow to the page.
 */
//slideIndex is the variable to hold the index of the slide currently on display
let slideIndex = 0;

// Next/previous controls
function plusSlides(n) {
  const slides = document.getElementsByClassName("mySlides");
  //wrap slides back around to max if it would be decremented to -1
  if(slideIndex <= 0 && n == -1)
    slideIndex = slides.length - 1;
  else
    slideIndex += n;
  showSlides();
}

// Thumbnail image controls
function currentSlide(n) {
    slideIndex = n
    showSlides();
}

//Show the selected slide
function showSlides() {
  const slides = document.getElementsByClassName("mySlides");
  const dots = document.getElementsByClassName("dot");

  //Hide not selected slides
for(slide of slides)
    slide.style.display = 'none';

slideIndex = slideIndex % slides.length;

//De-highlight dots
for(dot of dots)
    dot.className = dot.className.replace(" active","");

//Block formatting
slides[slideIndex].style.display = "block";
//Highlight current dot
dots[slideIndex].className += " active";
}