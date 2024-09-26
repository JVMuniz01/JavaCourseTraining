<h1>README for Java Worker Management Application</h1>
<h2>Overview</h2>

<p>This Java application is designed to manage worker information, contracts, and calculate income for a given month and year. It includes classes representing a worker, their department, and contracts. It also demonstrates how to handle user input, date parsing, and calculations. The application showcases the use of Java enums, object composition, exception handling (for date parsing), and various class relationships.</p> 

<h2>Features</h2>
<p>Worker Management: Create a worker with a name, level (e.g., JUNIOR, MID_LEVEL, SENIOR), base salary, and department.
Contracts Handling: Add multiple contracts to a worker. Each contract includes a date, hourly rate, and the number of hours worked.
Income Calculation: Calculate the total income for a worker for a specific month and year, based on contracts and base salary.</p>

<h2>How it's works</h2>
<p>The user is prompted to enter the department's name, worker's name, worker level, and base salary.
The user specifies how many contracts the worker has, followed by details of each contract (date, hourly rate, and duration in hours).
The user inputs the month and year to calculate the worker’s income based on their contracts for that period.
The application calculates and outputs the total income for the worker, including the base salary and any contracts within the specified period.</p>

<h2>Potentioal issues</h2>
<h3>Weak input validation</h3>
<p>-  The application currently lacks comprehensive input validation. For example:</p>
<p>-  The user is expected to enter a valid WorkerLevel (e.g., JUNIOR, MID_LEVEL, SENIOR), but no validation checks are in place to handle incorrect or unexpected input.</p>
<p>-  The application assumes that the user will enter a valid date in the dd/MM/yyyy format. Invalid date formats will trigger a ParseException, but the error is not recovered gracefully (e.g., by prompting the user to re-enter a correct date).</p>
<p>-  Numeric inputs, such as base salary and contract hours, are not validated for being positive or within reasonable limits.</p>

<h3>Lack of error masseges</h3>
<p>-  If a contract's date is incorrect or other contract details are invalid, the application does not provide clear feedback to the user about which input was wrong. This could confuse users, especially if they're entering multiple contracts.</p>
<p></p>

<h3>No Handling for Empty or Missing Inputs</h3>
<p>The application does not handle empty or missing inputs. If the user presses Enter without providing a value, the application may behave unexpectedly, especially when parsing numeric values (e.g., salary, hours, or value per hour).</p>
