# HTML Basics - I

- **Hyper Text Markup Language**
- html is not a programming language, it’s a markup language
- hyper text - using of hyper links for connecting to many other web pages
- markup language - using of annotations and tags to markup content, kind of **providing description to browser to how to render this content**
- html is basic building block, kinda skeleton of website
- html is no case sensitive

### Tags

- a keyword which tells the browser how to render different elements
- `<h1>this full line is known as element</h1>`
    - used in starting is *opening tag*
    - center line of words is the *content*
    - used in ending is *closing tag*

---

## HTML text elements

- help define and structure text content on a web page
- responsible for formatting, emphasizing and organizing text
- two types-
    - **block elements**:  starts on a new line, ***takes up full width of screen***, used by structural default
    - **inline elements**: do not start on a new line, only ***takes up require width by the element***, used to style or modify text

### To add a comment in html:

- `<!-- comment to be added in html, is written in here -->`

### Semantic tags and Non-Semantic tags

- semantic tags tells what kind of content is inside - for humans, browsers and search engines.
- non-semantic tags don’t describe there content - like `<div>` `<section>` or `<span>` tag

## Some important, constantly used tags:

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Mandeep's Notes</title>
</head>
<body>
  <header>
  <!-- six types of heading from largest to smallest font -->
    <h1>Welcome to My Website</h1>
    <h2>Welcome to My Website</h2>
    <h3>Welcome to My Website</h3>
    <h4>Welcome to My Website</h4>
    <h5>Welcome to My Website</h5>
    <h6>Welcome to My Website</h6>
  </header>

  <main>
    <nav>
    <ul>
      <li><a href="/">Home</a></li>
      <li><a href="/about">About</a></li>
      <li><a href="/services">Services</a></li>
      <li><a href="/contact">Contact</a></li>
    </ul>
		</nav>

    <section>
      <h2>About Me</h2>
      <p>I’m learning web development with Love Babbar’s course!</p>
      
      <!-- anchor tag used to add a hyperlink -->
      <a href="https://github.com/manublackarch/Love-Babbar-web-development-course-">Manu's notes</a>
      
      
      
      <!-- Div tag used to get these all below items in a div -->
      <div id="firstdiv">
      
      <!-- Image tag to add image -->
      <img src="image.jpg" alt="Description" width="300" height="200">
      
      <!-- Audio tag to add audio -->
      <audio controls>
      <source src="sound.mp3" type="audio/mpeg">
      Your browser does not support audio.
      </audio>
      
      <!-- video tag to add video -->
      <video width="640" height="360" controls>
      <source src="movie.mp4" type="video/mp4">
      Your browser does not support video.
      </video>
      
      </div>
    </section>
    
    <!-- use of article tag -->
    <article>
    <h2>10 Tips to Learn HTML</h2>
    <p>Start with understanding the basic tags...</p>
    </article>

		<!-- use of aside tag-->
		<aside>
    <h3>Related Articles</h3>
    <ul>
    <li><a href="#">Learn CSS</a></li>
    <li><a href="#">JavaScript Basics</a></li>
    </ul>
    </aside>

		
  </main>

  <footer>
    <p>© 2025 Mandeep Motan</p>
  </footer>
</body>
</html>

```

### DOCTYPE html

- `<DOCTYPE html>` used to declare html version
- always in the first line

### HTML tag (`<html>`)

- root tag of an html document
- all the html code is written in this tag

### Head tag (`<head>`)

- contains metadata about the webpage
- contains common contents like page title, character encoding, CSS/JS links, meta tags, favicon, etc

### Title tag (`<title>`)

- sets the title shown in the browser tab
- always written inside head tag

### Nav tag (`<nav>`)

- used to define a section of navigation links, like used for menus, site navigation links or internal page links **, (block level tag)**
- its a semantic HTML5 tag

### Body tag (`<body>`)

- contains everything visible on the webpage: text, images, links, button, etc

### Heading tag (`<h1>` to `<h6>`)

- used to indicate headings and subheadings, define titles
- all heading tags are block elements
- six types from largest to smallest font

### Paragraph tag (`<p>`)

- `<p></p>` tag is used to display a paragraph of text
- its a block level element
- browser automatically adds margin before and after <p> tags

### Image tag (`<img/>`)

- used to add image
- `src` attribute used to put the source of the image to be shown
- `alt` attribute used to put what will be shown if the image fails to load from the `src`

### Audio tag (`<audio>`)

- embeds sounds files
- `type` attribute to give the type of audio file
- optional attributes: `controls` , `autoplay` , `loop` , `muted`

### Video tag (`<video>`)

- embeds video files
- `type` attribute to give the type of video file
- optional attributes: `controls` , `autoplay` , `loop` , `muted` , `poster`

### Anchor tag (`<a>`)

- used to create hyperlinks **(clickable links that navigate to another webpage)**
- `href` attribute - (Hypertext REFerence) destination of hyperlink to where to navigate on clicking link

### Main tag (`<main>`)

- holds the main content of the webpage
- should be only one `<main>` per webpage

### Footer tag (`<footer>`)

- defines the bottom section of a webpage or a specific section/article
- kinda for copyright thing, contact info, social media links, navigation links, etc

---

## Sectional tags (non-semantic tags)

used to divide and structure content logically on a webpage

### 1. Division tag (`<div>`)

- used to group related html content together **, (block level tag)**
- acts as a container with no visual effect by default
- very useful for layout design and applying CSS styles or JS actions

### 2. Section tag (`<section>`)

- groups related content with a heading, kinda books chapter like thing **, (block level tag)**
- can stand as distinct part of document
- like grouping different paragraphs with different headings

### 3. Article tag (`<article>`)

- used for self-contained reusable block **, (block level tag)**
- reusable content like blog posts, news article, forum posts, post cards, etc

### 4. Aside tag (`<aside>`)

- used to contain content that’s related to but separate from main content **, (block level tag)**
- used for kinda to show ads, sidebar, tips, pull quotes

### 5. Span tag (`<span>`)

- acts a generic container for inline content **, (inline tag)**
- kinda used for styling a part of text, like selecting a part of sentence for styling it

---

## List in HTML

three types of list in html- unordered, ordered, descriptive

- **Unordered list (`<ul>`)**
    - when the order of items doesn’t matter
    - usually items are shown with bullets
    - <ul> tag for unordered list, each item is inside an <li> (list item) tag
    
    ```html
    <ul>
      <li>HTML</li>
      <li>CSS</li>
      <li>JavaScript</li>
    </ul>
    ```
    
1. **Ordered list (`<ol>`)**
    1. when the order of items matter 
    2. usually items are shown with numbers
    3. `<ol>` tag for ordered list,  each item is inside an `<li>` (list item) tag same as unordered list
    
    ```html
    <ol>
      <li>Login</li>
      <li>Add to Cart</li>
      <li>Checkout</li>
    </ol>
    ```
    
- **Description list `<dl>`**
    - used for *term-definition* style content
    - `<dl>` for description list, `<dt>` title of items, `<dd>` description of items
    
    ```html
    <dl>
      <dt>HTML</dt>
      <dd>A markup language for web pages.</dd>
      
      <dt>CSS</dt>
      <dd>Used for styling HTML elements.</dd>
    </dl>
    ```
    

---

## HTML attribute

- attributes in html provide extra information about elements
- they are always written in opening tag of element
- appear as name value pairs separated by =
- multiple attributes can be added to single element

### id attribute

- it is used to give an element a unique identifier
- each id must be unique across the entire html page
- its commonly used to target specific element in CSS or JS
- eg. `<div id=”firstdiv”> this is content of div tag </div>`

### class attribute

- it is used to group elements that share the same styling or behavior
- same class can be assigned to multiple elements
- one element can have multiple classes, separated by classes
- eg. `<div class=”pehliclass class2name class3name”>content of tag with class attribute</div>`
