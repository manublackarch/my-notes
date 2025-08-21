# HTML Basic - III

### Hyperlinks

Using anchor tag (`<a>`) to create different types of links

- `<a href=”[https://github.com/manublackarch/](https://github.com/manublackarch/)”  target=”_blank”>github repo of manu</a>`
    - target attribute set to _blank will redirect the page to open in new tab
- `<a href=”tel:+919858473218”> call me </a>`
    - this will create a call redirect, on clicking this link user’s phone app will open with phone number dialed on dial pad
- `<a href=”mailto:support@github.com”>support mail</a>`
    - this will open the mail app, with email address written in To bar

## HTML Forms

html forms are used to collect input from users, data entered through forms can be sent to a server or processed using JavaScript

```html
<form action="/submit" method="POST">
  <fieldset>
    <legend>Register</legend>

    <label for="name">Name:</label>
    <input id="name" type="text" placeholder="Your name"><br><br>

    <label for="email">Email:</label>
    <input id="email" type="email" placeholder="you@example.com"><br><br>

    <label>Gender:</label>
    <input type="radio" name="gender" value="male"> Male
    <input type="radio" name="gender" value="female"> Female<br><br>

    <label>Interests:</label>
    <input type="checkbox" name="html"> HTML
    <input type="checkbox" name="css"> CSS
    <input type="checkbox" name="js"> JS<br><br>

    <label for="file">Upload Resume:</label>
    <input type="file" id="file"><br><br>

    <label for="country">Country:</label>
    <select id="country" name="country">
      <option value="in">India</option>
      <option value="us">USA</option>
    </select><br><br>

    <label for="bio">Your Bio:</label><br>
    <textarea id="bio" rows="4" cols="40" placeholder="Tell us about you..."></textarea><br><br>

    <button type="submit">Register</button>
    <button type="reset">Reset</button>
  </fieldset>
</form>

```

### Form tag (`<form>`)

- this is the main container that holds all form input elements
- `action=”/url_to_send”` : action attribute is used to set URL where the form data will be sent
- `method=”POST”` : method attribute is used to set HTTP method- commonly POST or GET

## Input tag (`<input>`)

- main purpose is to take user input
- can be used to take various types of input like simple text, password, date, file upload, etc
- `type=”text”` attribute is the main attribute which is used to set the type of input field we want to create like simple text taking, button, drop down menu, file upload, radio button, etc
- value=
- `placeholder=”adfbeaf12@email.com”` it is used to set hint text inside the input field
- `name=”email”` used when submitting data

```html
<input type="text" placeholder="Your Name">   to take simple text input
<input type="password" placeholder="Enter Password">   to take password input
<input type="tel" placeholder="Enter Phone number">   to take phone number as input
<input type="email" placeholder="Email Address">    to take an email 
<input type="radio" name="gender" value="male"> Male    to create a radio button
<input type="checkbox" name="subscribe"> Subscribe       to create a checkbox
<input type="date">    to create a date select menu
<input type="file">    to create a file upload menu
<input type="submit" value="Submit">     to create a submit button
<input type="reset">    to create a reset button that will reset all form input
<input type="image" src="submit.png" alt="Submit" width="60">    to create a image button
```

### Label tag (`<label>`)

- used to label input fields
- kind of identification for input fields to know what to enter in what field
- `for=”email”` for attribute should always match the id of the input it labels

```html
<label for="username">User Name:</label>
<input id="username" type="text">
```

### Select (`<select>`) and option tags (`<option>`)

- `<select>` is basically used to create a drop down menu to select items
- `<option>` is used in select to create items that can be selected from drop down menu
- multiple can be added to select tag for multi-select drop down menu

```html
<label for="country">Select Country:</label>
<select id="country" name="country">
  <option value="in">India</option>
  <option value="us">USA</option>
  <option value="uk">UK</option>
</select>
```

### Button tag (`<button>`)

- used to create a clickable button
- just as we create a button using input tag with type submit attribute

```html
<button type="button" onclick="alert('Hello')">Click Me</button>
```

### Textarea tag (`<textarea>`)

- to take multiline user input
- like for taking user input in comments or feedback in forms
- rows and cols attribute can be set to customize the size of input field of textarea

```html
<textarea placeholder="Enter your message" rows="5" cols="30"></textarea>
```

### Fieldset (`<fieldset>`) and legend (`<legend>`)

- `<fieldset>` is used to group related inputs together
- `<legend>` is used to put a title on the border of field set

```html
<fieldset>
  <legend>Personal Info</legend>
  <label>Name: <input type="text"></label><br>
  <label>Age: <input type="number"></label>
</fieldset>
```