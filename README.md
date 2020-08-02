<<<<<<< HEAD
# Google Software Product Sprint

This repo contains Samir's portfolio and projects I'll work on throughout SPS.

To get started:

- Login to [Google Cloud Shell](https://ssh.cloud.google.com/cloudshell/editor)
- Clone this repo: `cd; git clone https://github.com/google/software-product-sprint.git`
- Open the GitHub setup walkthrough: `teachme ~/software-product-sprint/walkthroughs/week-0-setup/github-setup-walkthrough.md`
  - If the tutorial panel does not open or display the walkthrough contents, try refreshing the page.

Then follow the on-screen instructions to set up your repo.
=======
# WordList
An online word list for cochlear implant / hearing aid mapping


What? Online Wordlist 
Who? Those in the deaf / hard-of-hearing community 
Why? To help audiologists create maps for hearing aids / cochlear implants 

How (technical tools / skills / APIs)? 
Something to store data with and generate an output excel file (csv)
https://www.grapecity.com/blogs/how-to-importexport-excel-files-using-javascript-and-spread-sheets
Something that can play audio for a written word (unless we use a database with many prerecorded words)  (TODO: do research on how to edit sound (merge two sound sources))
https://cloud.google.com/text-to-speech/docs/basics
Could add an interactive graph for the analysis page (not MVP)
User friendly design (something very intuitive w/o clutter to allow ease of concentration)
Something to store lots of words and then randomize them into different lists
There are specific words often used -> research what wordlists commonly have
https://chs.asu.edu/sites/default/files/booklet-speech_recid_disc_4.0_0.pdf
https://www.e3diagnostics.com/-/media/e3-diagnostics/shared/pdf/articles-white
-papers/2014/word-recognition-testing--repeat-after-me-autumn-2014.pdf?la=en

Web-app pages:
Home page - Welcome to XXXX (links to Start, Instructions, Settings pages)
Instructions (how to use the program, recommendations if using with a young child, recommendations for listening environment and for headset / speaker volumes...)
Settings (can adjust how many words/basic sounds they want to do, add background noise…) 
Play page (click go when ready) 
Page opens with a play button, a text box to input their answers and a text box to add any notes (i.e. don’t know how to spell…) 
Code show keep track of how many times they play the sound - audiologists will use this info (i.e. if a user replays a sound 4x, it is likely a weak spot that needs to be addressed)
Top corner: shows how many words are done/left
End page: when the user is done the list, they get an option to export an csv file with their results, restart… If we have time we could include an analysis page (i.e. shows you what percentage of a certain type of word/sound you got wrong)
Instead of csv -> direct email
>>>>>>> eb510fdf0a0116c75f19af39f7b39ea56c40b035
