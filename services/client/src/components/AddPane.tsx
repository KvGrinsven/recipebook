import React from "react";

export function AddPane() {

  return <div className="AddPane">
    <h1>New recipe</h1>
    <form>
      <label htmlFor="title">
        Title: <input type="text" name="title" />
      </label>
      <br/>
      <label htmlFor="servings">
        Servings: <input type="number" name="servings" />
      </label>
      <p>... How do I want the ingredients to be entered?</p>
      <label htmlFor="directions">
        Directions: <input type="text" name="directions" />
      </label>

    </form>
  </div>
}
