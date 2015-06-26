using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Content;
using Microsoft.Xna.Framework.Graphics;

namespace Hungry_Cow_V1
{
    public abstract class Screen
    {
        public string type;
        protected HungryGame game;
        public virtual void loadContent(ContentManager content);
        public virtual void update(GameTime gameTime);
        public virtual void draw(SpriteBatch spriteBatch);
    }
}
