# HTML Basics - II

## More tags:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>More on tags</title>
</head>
<body>
    <!-- br tag - a line break tag-->
    <p>Hello<br>World!</p>
		
		<!-- hr tag to draw full length horizontal line-->
		<h1>Section 1</h1>
		<p>This is the first section.</p>
		<hr>
		<h1>Section 2</h1>
		<p>This is the second section.</p>

		<!--pre tag to preserve format-->
		<pre>
		Line 1
    Line 2 with spaces
		Line 3
		</pre>
		
		<!-- use of b tag to write text in bold -->
		<b>this text will be printed as bold text</b>
		<!-- try all other text formatting tags in html just like the above one-->

    
</body>
</html>
```

### Line Break tag (`<br>`)

- `<br>` tag is used to insert a line break, its moves content ahead of it to new line
- especially used when we want to break a new line without changing the paragraph
- it’s a self closing tag

### Horizontal Rule tag (`<hr>`)

- inserts a full long divider horizontal line across the page
- often used to separate sections
- its’ a self closing tag

### Preformatted tag (`<pre>`)

- displays text as it is written in html code (spaces, new lines, tabs)
- useful for code blocks, or like for preserving format

### Text formatting tags

- `<b>` tag : makes text bold but for visual importance only
- `<strong>` tag : its also used to make text bold but if the text has importance/emphasis in meaning
- `<i>` tag : makes text italic for styling
- `<u>` tag : to underline content
- `<small>` tag : makes text smaller like for side notes or disclaimers
- `<del>` tag : represents text has been moved or replaced, a strikethrough (line on text) is shown on content
- `<mark>` tag : to highlight content, shows a yellow background
- `<sup>` tag : super script tag used to show content as power
- `<sub>` tag : subscript tag used to show content in foot

## Table

```html
<style>
	table, tr, td, th{
		border: 2px, solid, yellow;
	}
</style>

<table>
	<caption>this is my first table</caption>
	<colgroup>
		<col span="1" style="background-color: grey;">
	</colgroup>
	<tr>
		<th>S.no</th>
		<th>Name</th>
		<th>city</th>
		<th>school</th>
	</tr>
	<tr>
		<td>1</td>
		<td>manu</td>
		<td rowspan="2">universe v</td>
		<td>dps</td>
	</tr>
	<tr>
		<td>2</td>
		<td>elon musk</td>
		<td>america school</td>
	</tr>
	<tr>
		<td>3</td>
		<td colspan="2">xi jin pig</td>
		<td>chinpokli school</td>
	<tr>
</table>
	
```

- `<table>` tag contains the **whole table**
- `<tr>` tag (table row) used to **make a table row**
- `<td>` tag (table data) to make a column in table row, to **make a single cell in row**
- `<thead>` tag used to place **the heading row** **of the table (best practice)**
- `<th>` tag (**table heading**) **top most column in top row,** used to store heading of the columns
- `<tbody>` tag used to store the **main body of the table (best practice)**
- `<tfoot>` tag used to place the **last row of the table (best practice)**
- `<caption>` tag used to assign **name of the table**, it’s always **written in table tag just in starting**

### **CSS for table**

- `border` property : to set border as by default, html table structure have no border
- `border-collapse: collapse;` : it’s used to remove gaps between cell borders (that double borders) and making the table look clean by merging the table border (single border)

### colspan and rowspan in html tables

In html tables, colspan and rowspan are attributes used with `<th>` or `<td>` elements to merge cells across multiple columns or rows.

- `colspan = “n”`
    - uses the cell to span n number of columns horizontally
    - merges cells horizontally
    - those number of cells to which it is spanned are deleted
- `rowspan = “n”`
    - uses the cell to span n number of rows vertically
    - merges cells vertically
    - same here we should remove the cells we spanned to

*these both properties can be used simultaneously on single cell to span it horizontally and vertically at the same time.*

### colgroup, col tag and span attribute

- `<colgroup>` used to define column wide style in a table, very useful when we have to apply style to whole columns
    - wraps the column definition
- `<col>` is used to put styles and properties for columns in it
- `span="n"` attribute used to select the column on which property is to be applied
    - if we don’t want to apply style on first column, we will just declare it :  `<col span=”1”>` and not put the style property in it
    - if i have to apply property to 2,3,4 columns and leave first column:
        - `<col span=”1”>` this line will leave 1st column without applying any property to it
        - `<col span=”3” style=”background-color: yellow;”>` this line will apply properties to next 3 consecutive columns after the 1st one