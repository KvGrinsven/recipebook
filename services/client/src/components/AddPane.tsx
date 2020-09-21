import React from "react";

export function AddPane() {

  return <div className="AddPane">
    <h1>New recipe</h1>
    <form>

      <label htmlFor="title">Title:</label><br/>
      <input type="text" name="title" autoComplete="off"/><br/>

      <label htmlFor="servings">Servings:</label><br/>
      <input type="number" name="servings" autoComplete="off"/><br/>

      <label htmlFor="ingredients">Ingredients:</label><br/>
      <input list="ingredients" name="ingredients" autoComplete="off"/>
      <datalist id="ingredients">
        <option value="Carrot"/>
        <option value="Potato"/>
        <option value="Tomato"/>
        <option value="Egg"/>
        <option value="Flower"/>
      </datalist><br/>

      <label htmlFor="directions">Directions:</label><br/>
      <input type="text" name="directions" autoComplete="off"/><br/>

      <br/>
      <input type="submit" value="Save"/>
    </form>
  </div>
}
