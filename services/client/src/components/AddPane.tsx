import React from "react";

export function AddPane() {

  return <div className="AddPane">
    <h1>New recipe</h1>
    <form className="AddForm">

      <label htmlFor="title">Title:</label><br/>
      <input type="text" name="title" autoComplete="off" required/><br/>

      <label htmlFor="servings">Servings:</label><br/>
      <input type="number" name="servings" autoComplete="off" required/><br/>

      <table>
        <tr>
          <th>Ingredient</th>
          <th>Amount</th>
          <th>Measure</th>
        </tr>
        <tr>
          <th>
            <select required>
              <option value="" disabled selected hidden>Choose an ingredient</option>
            </select>
          </th>
          <th><input type="number" autoComplete="off" required/></th>
          <th><label/></th>
        </tr>
      </table>
      <button className="AddIngredientButton">+ Add ingredient</button><br/><br/>

      <label htmlFor="directions">Directions:</label><br/>
      <input type="text" name="directions" autoComplete="off" required/><br/>

      <br/>
      <input type="submit" value="Save"/>
    </form>
  </div>
}
