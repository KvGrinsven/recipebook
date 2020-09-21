import React from "react";

export function AddPane() {

  return <div className="AddPane">
    <h1>New recipe</h1>
    <form>

      <label htmlFor="title">Title:</label><br/>
      <input type="text" name="title"/><br/>

      <label htmlFor="servings">Servings:</label><br/>
      <input type="number" name="servings"/><br/>

      <label htmlFor="ingredients">Ingredients:</label><br/>
      <input list="ingredients" name="ingredients"/>
      <datalist id="ingredients">
        <option value="Potato"/>
        <option value="Tomato"/>
        <option value="Egg"/>
        <option value="Flower"/>
        <option value="Carrot"/>
      </datalist><br/>

      <label htmlFor="directions">Directions:</label><br/>
      <input type="text" name="directions" /><br/>

      <br/>
      <input type="submit" value="Save"/>
    </form>
  </div>
}
