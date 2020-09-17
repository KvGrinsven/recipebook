import React from "react";

export function RecipeList({recipes, handleClick}: any) {

    return <div className="RecipeList">
      <h1>Recipes</h1>
      {recipes.map((recipe:any) => (
        <button key={recipe.id}
                onClick={() => handleClick(recipe.id)}
                type="button">
        {recipe.title} </button>
      ))}
    </div>
}
