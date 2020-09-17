import React from "react";

export function RecipeList({recipes, recipeClick, addClick}: any) {

    return <div className="RecipeList">
      <h1>Recipes</h1>
      {recipes.map((recipe:any) => (
        <button className="ListItem"
                key={recipe.id}
                onClick={() => recipeClick(recipe.id)}
                type="button">
        {recipe.title} </button>
      ))}
      <button className="ListItem"
              onClick={addClick}
              type="button">
      Add recipe</button>
    </div>
}
