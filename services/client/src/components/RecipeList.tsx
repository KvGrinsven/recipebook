import React from "react";

export function RecipeList({ recipes }: any) {

    return <div className="RecipeList">
      <h1>Recipes</h1>
      <ul>
        {recipes.map((recipe:any) => (
          <li key={recipe.id}>{recipe.title}</li>
        ))}
      </ul>
    </div>
}
